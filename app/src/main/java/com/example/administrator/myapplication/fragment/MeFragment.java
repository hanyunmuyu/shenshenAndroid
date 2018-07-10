package com.example.administrator.myapplication.fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.QrCodeActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {
    Button logout;
    private ImageView imageView;

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

        ButterKnife.bind(this, view);

        imageView = view.findViewById(R.id.capture);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), QrCodeActivity.class));
            }
        });
        return view;
    }

    @OnClick(R.id.logout)
    public void onClick(View v) {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.logout();
    }
}
