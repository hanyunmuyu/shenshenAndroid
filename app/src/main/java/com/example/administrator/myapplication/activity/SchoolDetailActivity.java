package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.schoolDetail.adapter.SchoolDetailAdapter;
import com.example.administrator.myapplication.schoolDetail.fragment.AllFragment;
import com.example.administrator.myapplication.schoolDetail.fragment.BestFragment;
import com.example.administrator.myapplication.schoolDetail.fragment.HotFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SchoolDetailActivity extends FragmentActivity {
    @BindView(R.id.tl)
    public TabLayout mTabLayout;
    @BindView(R.id.vp)
    public ViewPager mViewPager;

    private String[] mTitles = {"全部", "热门", "精华"};
    private SchoolDetailAdapter mSchoolDetailAdapter;
    private List<Fragment> mFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_detail);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        int schoolId = intent.getIntExtra("schoolId", 1);
//        Toast.makeText(this, schoolId + "", Toast.LENGTH_SHORT).show();
        initView();
    }

    private void initView() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new AllFragment());
        mFragmentList.add(new HotFragment());
        mFragmentList.add(new BestFragment());
        mSchoolDetailAdapter = new SchoolDetailAdapter(getSupportFragmentManager(), mFragmentList, mTitles);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mViewPager.setAdapter(mSchoolDetailAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

}
