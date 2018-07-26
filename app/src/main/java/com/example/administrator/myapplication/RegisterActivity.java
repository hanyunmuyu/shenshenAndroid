package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.myapplication.activity.LoginActivity;
import com.example.administrator.myapplication.bean.BaseBean;
import com.example.administrator.myapplication.lib.RetrofitManager;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
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
        Toast.makeText(this, gender + "", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.backBtn)
    public void back() {
        finish();
    }

    @OnClick(R.id.register)
    public void register() {
        String userName = name.getText().toString();
        String pwd = password.getText().toString();
        if (userName.equals("") || userName == null) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            return;
        }

        if (pwd.equals("") || pwd == null) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            return;
        }

        Call<BaseBean> call = RetrofitManager.getInstance().getApiService(this).register(userName, pwd, gender);
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
}
