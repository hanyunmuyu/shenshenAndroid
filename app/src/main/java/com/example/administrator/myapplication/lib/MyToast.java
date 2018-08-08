package com.example.administrator.myapplication.lib;

import android.annotation.SuppressLint;
import android.widget.Toast;

import com.example.administrator.myapplication.MainActivity;

public class MyToast {
    private static Toast sToast;

    @SuppressLint("ShowToast")
    public static void show(String msg) {
        if (sToast == null) {
            sToast = Toast.makeText(MainActivity.mContext, msg, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(msg);
        }
        sToast.show();
    }
}
