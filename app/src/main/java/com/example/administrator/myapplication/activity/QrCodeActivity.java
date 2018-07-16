package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QrCodeActivity extends Activity {
    @BindView(R.id.qr)
    public ImageView qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        ButterKnife.bind(this);
        qr.setImageBitmap(CodeUtils.createImage("寒云", 1000, 1000, null));
    }

    @OnClick(R.id.backBtn)
    public void OnClick(View view) {
        finish();
    }
}
