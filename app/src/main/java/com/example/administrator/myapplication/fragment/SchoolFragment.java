package com.example.administrator.myapplication.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public SchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_school, container, false);
        tabLayout = view.findViewById(R.id.tl);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabLayout.addTab(tabLayout.newTab().setText("热门"));
        tabLayout.addTab(tabLayout.newTab().setText("高校"));
        tabLayout.addTab(tabLayout.newTab().setText("社团"));
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
