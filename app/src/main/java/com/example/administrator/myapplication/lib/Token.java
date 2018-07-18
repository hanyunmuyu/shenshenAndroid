package com.example.administrator.myapplication.lib;

import android.content.Context;
import android.content.Intent;

import com.example.administrator.myapplication.activity.LoginActivity;

public class Token {
    private Context context;
    private static Token token;

    public static synchronized Token getInstance() {
        if (token == null) {
            token = new Token();
        }
        return token;
    }

    public void checkCode(Context context, int code) {
        this.context = context;
        switch (code) {
            case 200:
                break;
            case 4000:
                //认证失败
                context.startActivity(new Intent(context, LoginActivity.class));
                break;
            default:
                break;
        }
    }

}
