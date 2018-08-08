package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.model.QrCodeModel;
import com.squareup.picasso.Picasso;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QrCodeActivity extends Activity {
    @BindView(R.id.qr)
    public ImageView qr;
    @BindView(R.id.pic)
    public ImageView pic;
    @BindView(R.id.title)
    public TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        ButterKnife.bind(this);
        QrCodeModel qrCodeModel = (QrCodeModel) getIntent().getSerializableExtra("code");
        Picasso.get().load(qrCodeModel.getPic()).fit().centerCrop().into(pic);
        title.setText(qrCodeModel.getTitle());
        qr.setImageBitmap(CodeUtils.createImage(qrCodeModel.getContent(), 1000, 1000, null));
    }

    @OnClick(R.id.backBtn)
    public void OnClick(View view) {
        finish();
    }
}
