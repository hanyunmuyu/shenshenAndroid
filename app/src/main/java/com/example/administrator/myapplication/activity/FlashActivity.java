package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;

public class FlashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(FlashActivity.this, MainActivity.class));
                finish();
            }
        }, 300);
    }
}
