package com.example.administrator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.activity.LoginActivity;
import com.example.administrator.myapplication.fragment.ClubFragment;
import com.example.administrator.myapplication.fragment.ExploreFragment;
import com.example.administrator.myapplication.fragment.HomeFragment;
import com.example.administrator.myapplication.fragment.MeFragment;
import com.example.administrator.myapplication.fragment.MessageFragment;
import com.example.administrator.myapplication.fragment.SchoolFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private LinearLayout bottom;
    private int position = 1;
    private int tmpPosition = 1;
    private ExploreFragment exploreFragment;
    private HomeFragment homeFragment;
    private SchoolFragment schoolFragment;
    private MeFragment meFragment;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        tmpPosition = position;
        sharedPreferences = getSharedPreferences("user", Context.MODE_PRIVATE);
        initView();
    }

    private void init() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hiddenFragment(fragmentTransaction);
        showFragment(fragmentTransaction);
    }

    private void hiddenFragment(FragmentTransaction fragmentTransaction) {
        if (exploreFragment != null) {
            fragmentTransaction.hide(exploreFragment);
        }
        if (homeFragment != null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (schoolFragment != null) {
            fragmentTransaction.hide(schoolFragment);
        }
        if (meFragment != null) {
            fragmentTransaction.hide(meFragment);
        }
    }

    private void showFragment(FragmentTransaction fragmentTransaction) {
        switch (position) {
            case 0:
                if (exploreFragment == null) {
                    exploreFragment = new ExploreFragment();
                    fragmentTransaction.add(R.id.fg, exploreFragment);
                } else {
                    fragmentTransaction.show(exploreFragment);
                }
                break;
            case 1:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.fg, homeFragment);
                } else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case 2:
                if (schoolFragment == null) {
                    schoolFragment = new SchoolFragment();
                    fragmentTransaction.add(R.id.fg, schoolFragment);
                } else {
                    fragmentTransaction.show(schoolFragment);
                }
                break;
            case 3:
                if (meFragment == null) {
                    meFragment = new MeFragment();
                    fragmentTransaction.add(R.id.fg, meFragment);
                } else {
                    fragmentTransaction.show(meFragment);
                }
                if (checkToken() == false) {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
                break;
            default:
                break;
        }
        fragmentTransaction.commit();
    }

    private void initView() {
        bottom = findViewById(R.id.bottom);
        for (int i = 0; i < bottom.getChildCount(); i++) {
            LinearLayout ll = (LinearLayout) bottom.getChildAt(i);
            ll.setId(i);
            ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    position = view.getId();
                    initView();
                }

            });
            selectBottom(ll);
        }
        init();
    }

    private void selectBottom(LinearLayout view) {
        TextView tv = (TextView) view.getChildAt(1);
        tv.setSelected(false);
        if (view.getId() == position) {
            tv.setSelected(true);
        } else {
            tv.setSelected(false);
        }
    }

    private boolean checkToken() {
        String token = sharedPreferences.getString("token", null);
        if (token == null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("token", "123456");
            editor.commit();
            return false;
        }
        return true;
    }

    public void logout() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().commit();
        startActivity(new Intent(this, LoginActivity.class));
        position = tmpPosition;
        initView();
    }
}
