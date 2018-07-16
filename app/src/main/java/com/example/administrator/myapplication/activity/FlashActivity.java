package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.jph.takephoto.app.TakePhotoActivity;
import com.jph.takephoto.model.TResult;

public class FlashActivity extends TakePhotoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(FlashActivity.this, MainActivity.class));
//                finish();
//            }
//        }, 300);
        getTakePhoto().onPickMultiple(3);

    }

    @Override
    public void takeSuccess(TResult result) {
        result.getImages();
    }

    @Override
    public void takeFail(TResult result, String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void takeCancel() {
        super.takeCancel();
    }

}
