package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.QrCodeActivity;
import com.example.administrator.myapplication.lib.CircleTransform;
import com.jph.takephoto.app.TakePhotoFragment;
import com.jph.takephoto.model.TImage;
import com.jph.takephoto.model.TResult;
import com.squareup.picasso.Picasso;
import java.io.File;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends TakePhotoFragment {

    @BindView(R.id.avatar)
    public ImageView avatar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        ButterKnife.bind(this, view);

        return view;
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
        getTakePhoto().onPickFromGallery();
    }

    @Override
    public void takeSuccess(TResult result) {
        TImage tImage = result.getImage();
        Toast.makeText(getContext(), tImage.getOriginalPath(), Toast.LENGTH_SHORT).show();
        Picasso.get()
                .load(Uri.fromFile(new File(tImage.getOriginalPath())))
                .transform(new CircleTransform())
                .into(avatar);
    }

    @Override
    public void takeFail(TResult result, String msg) {
        super.takeFail(result, msg);
    }

    @Override
    public void takeCancel() {
        super.takeCancel();
    }
}
