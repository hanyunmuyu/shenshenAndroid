package com.example.administrator.myapplication.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.school.ClubFragment;
import com.example.administrator.myapplication.school.HomeFragment;
import com.example.administrator.myapplication.school.adapter.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private HomeAdapter homeAdapter;
    private List<Fragment> fragmentList;
    private String[] titles = {"推荐", "社团", "校园"};
    @BindView(R.id.scan)
    public ImageView scan;
    @BindView(R.id.search)
    public ImageView search;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_school, container, false);
        ButterKnife.bind(this, view);
        tabLayout = view.findViewById(R.id.tl);
        viewPager = view.findViewById(R.id.vp);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        fragmentList = new ArrayList<>();

        fragmentList.add(new HomeFragment());
        fragmentList.add(new ClubFragment());
        fragmentList.add(new com.example.administrator.myapplication.school.SchoolFragment());

        homeAdapter = new HomeAdapter(getChildFragmentManager(), fragmentList, titles);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(homeAdapter);

        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
