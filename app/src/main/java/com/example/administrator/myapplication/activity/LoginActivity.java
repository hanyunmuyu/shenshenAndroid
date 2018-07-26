package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.RegisterActivity;
import com.example.administrator.myapplication.bean.UserBean;
import com.example.administrator.myapplication.lib.RetrofitManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends Activity {
    private SharedPreferences sharedPreferences;

    @BindView(R.id.username)
    public EditText username;
    @BindView(R.id.password)
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        sharedPreferences = getSharedPreferences("user", Context.MODE_PRIVATE);

    }

    @OnClick(R.id.login)
    public void click() {
        final String userName = username.getText().toString();
        String pass = password.getText().toString();
        if (userName.equals("")) {
            Toast.makeText(getApplicationContext(), "用户名不可以为空", Toast.LENGTH_SHORT).show();
            return;
        }

        if (pass.equals("")) {
            Toast.makeText(getApplicationContext(), "密码不可以为空", Toast.LENGTH_SHORT).show();
            return;
        }
        Call<UserBean> call = RetrofitManager.getInstance().getApiService(this).login(userName, pass);
        call.enqueue(new Callback<UserBean>() {
            @Override
            public void onResponse(Call<UserBean> call, Response<UserBean> response) {
                UserBean userBean = response.body();
                if (userBean.getCode() == 400) {
                    Toast.makeText(getApplicationContext(), userBean.getMsg(), Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("token", userBean.getData().getApi_token()).commit();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }
            }

            @Override
            public void onFailure(Call<UserBean> call, Throwable t) {

            }
        });
    }

    @OnClick(R.id.backBtn)
    public void back() {
        finish();
    }

    @OnClick(R.id.register)
    public void register() {
        startActivity(new Intent(this, RegisterActivity.class));
    }
}
