package com.example.administrator.myapplication.fragment;


import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    private ImageView imageView;
    private ImageView iv;

    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        ZXingLibrary.initDisplayOpinion(getActivity().getApplicationContext());
//        Intent intent = new Intent(getActivity().getApplicationContext(), CaptureActivity.class);
//        startActivityForResult(intent, 1);
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        imageView = view.findViewById(R.id.capture);
        iv = view.findViewById(R.id.iv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setImageBitmap(CodeUtils.createImage("寒云", 400, 400, BitmapFactory.decodeResource(getResources(), R.mipmap.avatar)));
                iv.setVisibility(1);
            }
        });
        return view;
    }

}
