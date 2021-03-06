package com.example.administrator.myapplication.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.MyClubActivity;
import com.example.administrator.myapplication.activity.QrCodeActivity;
import com.example.administrator.myapplication.activity.UserActivity;
import com.example.administrator.myapplication.api.Api;
import com.example.administrator.myapplication.api.ApiService;
import com.example.administrator.myapplication.bean.UploadBean;
import com.example.administrator.myapplication.bean.UserBean;
import com.example.administrator.myapplication.lib.CircleTransform;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.lib.Token;
import com.jph.takephoto.app.TakePhoto;
import com.jph.takephoto.app.TakePhotoFragment;
import com.jph.takephoto.compress.CompressConfig;
import com.jph.takephoto.model.TImage;
import com.jph.takephoto.model.TResult;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.IOException;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends TakePhotoFragment {

    @BindView(R.id.avatar)
    public ImageView avatar;
    @BindView(R.id.nickName)
    public TextView nickName;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        ButterKnife.bind(this, view);

        initData();

        return view;
    }

    private void initData() {
        Call<UserBean> call = RetrofitManager.getInstance().getApiService().getUserInfo();
        call.enqueue(new Callback<UserBean>() {
            @Override
            public void onResponse(Call<UserBean> call, Response<UserBean> response) {
                UserBean userBean = response.body();
                Token.getInstance().checkCode(getContext(), userBean.getCode());
                if (userBean.getCode() == 200) {
                    UserBean.DataBean dataBean = userBean.getData();

                    Picasso.get()
                            .load(dataBean.getAvatar())
                            .transform(new CircleTransform())
                            .into(avatar);
                    nickName.setText(dataBean.getName());
                }

            }

            @Override
            public void onFailure(Call<UserBean> call, Throwable t) {

            }
        });
    }

    @OnClick(R.id.scan)
    public void scanCode(View view) {

    }

    @OnClick(R.id.capture)
    public void showQrCode(View view) {
        startActivity(new Intent(getContext(), QrCodeActivity.class));

    }

    @OnClick(R.id.logout)
    public void onClick(View v) {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.logout();
    }

    @OnClick(R.id.avatar)
    public void choiceAvatar(View view) {
//        File outDir = new File(Environment.getExternalStorageDirectory() + "/shenshen/Image/");
//        if (!outDir.exists()) {
//            outDir.mkdirs();
//        }
//        File outFile = new File(outDir, System.currentTimeMillis() + ".jpg");
//
//        Uri uri = Uri.fromFile(outFile);
//        getTakePhoto().onPickFromCapture(uri);
//        getTakePhoto().onPickFromGallery();
        CompressConfig compressConfig = new CompressConfig.Builder().setMaxSize(50 * 1024).setMaxPixel(800).create();
        TakePhoto takePhoto = getTakePhoto();
        takePhoto.onEnableCompress(compressConfig, true);
        takePhoto.onPickFromGallery();
    }

    @Override
    public void takeSuccess(TResult result) {
        TImage tImage = result.getImage();
        Picasso.get()
                .load(Uri.fromFile(new File(tImage.getOriginalPath())))
                .transform(new CircleTransform())
                .into(avatar);
        uploadFile(new File(tImage.getCompressPath()));
    }

    @Override
    public void takeFail(TResult result, String msg) {
        super.takeFail(result, msg);
    }

    @Override
    public void takeCancel() {
        super.takeCancel();
    }

    private void uploadFile(File file) {

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
        Call<UploadBean> call = RetrofitManager.getInstance().getApiService().updateAvatar(description, body);
        call.enqueue(new Callback<UploadBean>() {
            @Override
            public void onResponse(Call<UploadBean> call, Response<UploadBean> response) {
                UploadBean uploadBean = response.body();
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

    @OnClick(R.id.myClub)
    public void myClub() {
        startActivity(new Intent(getContext(), MyClubActivity.class));
    }

    @OnClick(R.id.editBtn)
    public void editUserInfo() {
//        startActivity(new Intent(getContext(), UserActivity.class));
    }

    @Override
    public void onResume() {
        super.onResume();
//        initData();
    }
}
