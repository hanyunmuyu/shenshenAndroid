package com.example.administrator.myapplication.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.MessageBean;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.message.NotificationFragment;
import com.example.administrator.myapplication.message.adapter.MessageAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends Fragment {

    @BindView(R.id.tab)
    public TabLayout mTabLayout;
    @BindView(R.id.vp)
    public ViewPager mViewPager;

    private String[] titles = {"消息", "通知"};
    private List<Fragment> mFragmentList;
    private MessageAdapter mMessageAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new com.example.administrator.myapplication.message.MessageFragment());
        mFragmentList.add(new NotificationFragment());
        mMessageAdapter = new MessageAdapter(getChildFragmentManager(), mFragmentList, titles);
        mViewPager.setAdapter(mMessageAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }


}
