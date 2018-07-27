package com.example.administrator.myapplication.schoolDetail.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.SchoolNewsListBean;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.schoolDetail.adapter.AllNewsAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AllFragment extends Fragment {

    @BindView(R.id.tv)
    public RecyclerView mRecyclerView;

    public AllNewsAdapter mAllNewsAdapter;


    private List<Map<String, Object>> mMapList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.school_detail_fragment_all, container, false);
        ButterKnife.bind(this, view);
        initView();
        initData();

        return view;
    }

    private void initView() {
        mMapList = new ArrayList<>();
        mAllNewsAdapter = new AllNewsAdapter(getContext(), mMapList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mAllNewsAdapter);
    }

    private void initData() {
        Call<SchoolNewsListBean> call = RetrofitManager.getInstance().getApiService(getContext()).getSchoolNewsList(0);
        call.enqueue(new Callback<SchoolNewsListBean>() {
            @Override
            public void onResponse(Call<SchoolNewsListBean> call, Response<SchoolNewsListBean> response) {
                SchoolNewsListBean schoolNewsListBean = response.body();
                List<Map<String, Object>> list = new ArrayList<>();
                for (SchoolNewsListBean.DataBeanX.DataBean dataBean : schoolNewsListBean.getData().getData()) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("title", dataBean.getTitle());
                    list.add(map);
                }
                mMapList.addAll(list);
                mAllNewsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<SchoolNewsListBean> call, Throwable t) {

            }
        });
    }

}
