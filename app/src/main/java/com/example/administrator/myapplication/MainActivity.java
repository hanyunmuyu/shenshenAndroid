package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

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
    private int position = 3;
    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initFragment();
        initView();
    }

    private void initFragment() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new ExploreFragment());
//        fragmentList.add(new HomeFragment());
        fragmentList.add(new SchoolFragment());
        fragmentList.add(new MessageFragment());
        fragmentList.add(new MeFragment());
    }

    private void init() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for (int index = 0; index < fragmentList.size(); index++) {
            if (fragmentList.get(index).isAdded()) {
                fragmentTransaction.hide(fragmentList.get(index));
            } else {
                fragmentTransaction.add(R.id.fg, fragmentList.get(index));
                fragmentTransaction.hide(fragmentList.get(index));
            }
        }
        fragmentTransaction.show(fragmentList.get(position));
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
}
