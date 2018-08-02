package com.example.administrator.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.contrarywind.interfaces.IPickerViewData;
import com.example.administrator.myapplication.activity.LoginActivity;
import com.example.administrator.myapplication.activity.UserActivity;
import com.example.administrator.myapplication.bean.BaseBean;
import com.example.administrator.myapplication.bean.SchoolAllBean;
import com.example.administrator.myapplication.lib.RetrofitManager;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends Activity {
    private int gender = 3;

    @BindView(R.id.name)
    public EditText name;
    @BindView(R.id.password)
    public EditText password;

    @BindView(R.id.schoolName)
    public TextView schoolName;

    private ArrayList<School> mSchoolBeans = new ArrayList<>();
    private int schoolId = 0;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        initData();
    }

    private class School implements IPickerViewData {
        @Override
        public String getPickerViewText() {
            return name;
        }

        private String name;
        private int id;

        public School(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    private void initData() {
        School school = new School("请选择高校", 0);
        mSchoolBeans.add(school);
        Call<SchoolAllBean> call = RetrofitManager.getInstance().getApiService(this).getAllSchool();
        call.enqueue(new Callback<SchoolAllBean>() {
            @Override
            public void onResponse(Call<SchoolAllBean> call, Response<SchoolAllBean> response) {
                SchoolAllBean schoolAllBean = response.body();
                for (SchoolAllBean.DataBean dataBean : schoolAllBean.getData()) {
                    School school = new School(dataBean.getSchool_name(), dataBean.getId());
                    mSchoolBeans.add(school);
                }
            }

            @Override
            public void onFailure(Call<SchoolAllBean> call, Throwable t) {

            }
        });
    }

    private void pick() {
        OptionsPickerView pvOptions = new OptionsPickerBuilder(this, new OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3, View v) {
                schoolId = mSchoolBeans.get(options1).getId();
                schoolName.setText(mSchoolBeans.get(options1).getPickerViewText());
            }
        }).setTitleText("选择高校")
                .setContentTextSize(20)//设置滚轮文字大小
                .setDividerColor(Color.LTGRAY)//设置分割线的颜色
                .build();
        pvOptions.setPicker(mSchoolBeans);
        pvOptions.show();
    }

    @OnClick(R.id.schoolName)
    public void click() {
        pick();
    }


    @OnCheckedChanged({R.id.man, R.id.women, R.id.secret})
    public void onRadioCheck(CompoundButton view, boolean isChanged) {
        switch (view.getId()) {
            case R.id.man:
                if (isChanged) {
                    gender = 1;
                }
                break;
            case R.id.women:
                if (isChanged) {
                    gender = 2;
                }
                break;
            default:
                if (isChanged) {
                    gender = 3;
                }
                break;
        }
    }

    @OnClick(R.id.backBtn)
    public void back() {
        finish();
    }

    @OnClick(R.id.register)
    public void register() {

        if (schoolId != 0) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    flag = true;
                    String userName = name.getText().toString();
                    String pwd = password.getText().toString();
                    if (userName.equals("") || userName == null) {
                        Toast.makeText(getApplicationContext(), "用户名不可以为空", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (pwd.equals("") || pwd == null) {
                        Toast.makeText(getApplicationContext(), "密码不可以为空", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    Call<BaseBean> call = RetrofitManager.getInstance().getApiService(getApplicationContext()).register(userName, pwd, gender, schoolId);
                    call.enqueue(new Callback<BaseBean>() {
                        @Override
                        public void onResponse(Call<BaseBean> call, Response<BaseBean> response) {
                            BaseBean baseBean = response.body();
                            if (baseBean.getCode() == 200) {
                                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                            } else {
                                Toast.makeText(getApplicationContext(), baseBean.getMsg(), Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<BaseBean> call, Throwable t) {

                        }
                    });
                }
            });
            alert.setNegativeButton("考虑一下", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    flag = false;
                }
            });
            alert.setMessage("选择高校后不可以更改！！！");
            alert.setTitle("温馨提示");
            alert.show();
        } else {
            Toast.makeText(getApplicationContext(), "选择所属高校", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.contact)
    public void contactMe() {
    }
}
