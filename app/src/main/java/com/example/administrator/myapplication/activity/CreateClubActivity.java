package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dyhdyh.widget.loading.dialog.LoadingDialog;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.ClubCategory;
import com.example.administrator.myapplication.bean.UploadBean;
import com.example.administrator.myapplication.lib.CircleTransform;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.jph.takephoto.app.TakePhoto;
import com.jph.takephoto.app.TakePhotoActivity;
import com.jph.takephoto.compress.CompressConfig;
import com.jph.takephoto.model.TImage;
import com.jph.takephoto.model.TResult;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CreateClubActivity extends TakePhotoActivity {
    @BindView(R.id.logo)
    public ImageView logo;

    @BindView(R.id.category)
    public LinearLayout category;
    @BindView(R.id.clubName)
    public EditText clubName;
    private String logoStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_club);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        Call<ClubCategory> call = RetrofitManager.getInstance().getApiService(this).getClubCategory();
        call.enqueue(new Callback<ClubCategory>() {
            @Override
            public void onResponse(Call<ClubCategory> call, Response<ClubCategory> response) {
                ClubCategory clubCategory = response.body();
                for (ClubCategory.DataBean dataBean : clubCategory.getData()) {
                    CheckBox checkBox = new CheckBox(getApplicationContext());
                    checkBox.setText(dataBean.getCategory_name());
                    checkBox.setId(dataBean.getId());
                    category.addView(checkBox);
                }
            }

            @Override
            public void onFailure(Call<ClubCategory> call, Throwable t) {

            }
        });
    }

    @OnClick(R.id.logoBtn)
    public void uploadLogo() {
        CompressConfig compressConfig = new CompressConfig.Builder().setMaxSize(50 * 1024).setMaxPixel(800).create();
        TakePhoto takePhoto = getTakePhoto();
        takePhoto.onEnableCompress(compressConfig, true);
        takePhoto.onPickFromGallery();
    }

    private String getCategory() {
        String ids = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < category.getChildCount(); i++) {
            CheckBox checkBox = (CheckBox) category.getChildAt(i);
            if (checkBox.isChecked()) {
                list.add(checkBox.getId());
                ids = ids + checkBox.getId() + ",";
            }
        }
        return ids;
    }

    @OnClick(R.id.createClubBtn)
    public void createClub() {
        String name = clubName.getText().toString();
        if (name.equals("") || name == null) {
            Toast.makeText(this, "社团名称不可以为空", Toast.LENGTH_SHORT).show();
            return;
        }
        String category = getCategory();
        if (category.equals("")) {
            Toast.makeText(this, "至少选择一个分类", Toast.LENGTH_SHORT).show();
            return;
        }
        if (logoStr == null || logoStr.equals("")) {
            Toast.makeText(this, "请选择徽标", Toast.LENGTH_SHORT).show();
            return;
        }
        create(logoStr, name, category);
    }

    @Override
    public void takeSuccess(TResult result) {
        TImage tImage = result.getImage();
        Picasso.get()
                .load(Uri.fromFile(new File(tImage.getOriginalPath())))
                .transform(new CircleTransform())
                .into(logo);
        this.logoStr = tImage.getCompressPath()
        ;
    }

    @Override
    public void takeFail(TResult result, String msg) {
        super.takeFail(result, msg);
    }

    @Override
    public void takeCancel() {
        super.takeCancel();
    }

    private void create(String path, String name, String category) {
        LoadingDialog.make(this).show();
        File file = new File(path);
        // 创建 RequestBody，用于封装构建RequestBody
        RequestBody requestFile =
                RequestBody.create(MediaType.parse("multipart/form-data"), file);
        //MultipartBody.Part  和后端约定好Key，这里的partName是用image
        MultipartBody.Part body =
                MultipartBody.Part.createFormData("file", file.getName(), requestFile);
        //添加描述
        String descriptionString = "头像";
        RequestBody description =
                RequestBody.create(
                        MediaType.parse("multipart/form-data"), descriptionString);
        Call<UploadBean> call = RetrofitManager.getInstance().getApiService(this).createClub(description, body, name, category);
        call.enqueue(new Callback<UploadBean>() {
            @Override
            public void onResponse(Call<UploadBean> call, Response<UploadBean> response) {
                UploadBean uploadBean = response.body();
                LoadingDialog.cancel();
                if (uploadBean.getCode() == 400) {
                    Toast.makeText(getApplicationContext(), uploadBean.getMsg(), Toast.LENGTH_SHORT).show();
                }
//                List<UploadBean.DataBean> dataBeanList = uploadBean.getData();
//                String ids = null;
//                for (UploadBean.DataBean dataBean : dataBeanList) {
//                    ids += dataBean.getId() + ",";
//                }
            }

            @Override
            public void onFailure(Call<UploadBean> call, Throwable t) {

            }
        });
    }

}
