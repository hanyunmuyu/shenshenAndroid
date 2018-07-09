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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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
        String userName = username.getText().toString();
        String pass = password.getText().toString();
        if (userName.equals("")) {
            Toast.makeText(getApplicationContext(), "用户名不可以为空", Toast.LENGTH_SHORT).show();
            return;
        }

        if (pass.equals("")) {
            Toast.makeText(getApplicationContext(), "密码不可以为空", Toast.LENGTH_SHORT).show();
            return;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("token", "123456").commit();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
