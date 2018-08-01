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

    private int page = 0;
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
        initData();
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

    private void initData() {

        Call<MessageBean> call = RetrofitManager.getInstance().getApiService(getContext()).getUserMessage(page);
        call.enqueue(new Callback<MessageBean>() {
            @Override
            public void onResponse(Call<MessageBean> call, Response<MessageBean> response) {
                MessageBean messageBean = response.body();
                messageBean.getData().getData();
            }

            @Override
            public void onFailure(Call<MessageBean> call, Throwable t) {

            }
        });
    }

}
