package com.example.administrator.myapplication.schoolDetail.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
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
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

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

    @BindView(R.id.recyclerview)
    public RecyclerView mRecyclerView;

    @BindView(R.id.refreshLayout)
    public RefreshLayout refreshLayout;

    public AllNewsAdapter mAllNewsAdapter;


    private List<Map<String, Object>> mMapList;
    private int page = 1;
    private int schoolId;
    private int totalPage = 1;
    public AllFragment(int schoolId) {
        this.schoolId = schoolId;
    }

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

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout r) {
                page = 1;
                initData();
                mAllNewsAdapter.refresh();
                refreshLayout.finishRefresh(500);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout r) {
                initData();
                refreshLayout.finishLoadMore(500);
            }
        });


        mMapList = new ArrayList<>();
        mAllNewsAdapter = new AllNewsAdapter(getContext(), mMapList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mAllNewsAdapter);
    }

    private void initData() {
        Call<SchoolNewsListBean> call = RetrofitManager.getInstance().getApiService().getSchoolNewsList(schoolId, page);
        call.enqueue(new Callback<SchoolNewsListBean>() {
            @Override
            public void onResponse(Call<SchoolNewsListBean> call, Response<SchoolNewsListBean> response) {
                SchoolNewsListBean schoolNewsListBean = response.body();
                if (schoolNewsListBean.getCode() == 200) {
                    page++;
                    List<Map<String, Object>> list = new ArrayList<>();
                    for (SchoolNewsListBean.DataBeanX.DataBean dataBean : schoolNewsListBean.getData().getData()) {
                        Map<String, Object> map = new HashMap<>();
                        map.put("title", dataBean.getTitle());
                        map.put("created_at", dataBean.getCreated_at());
                        map.put("content", dataBean.getContent());
                        map.put("imgList", dataBean.getImage_list());
                        list.add(map);
                    }
                    mMapList.addAll(list);
                    mAllNewsAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<SchoolNewsListBean> call, Throwable t) {

            }
        });
    }
}
