package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.api.Api;
import com.example.administrator.myapplication.api.ApiService;
import com.example.administrator.myapplication.bean.ClubListBean;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.school.adapter.ClubRecyclerAdapter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClubFragment extends Fragment {
    private ClubRecyclerAdapter clubRecyclerAdapter;
    private List<Map<String, Object>> mapArrayList;
    private Retrofit retrofit;
    private ApiService apiService;
    private Integer page = 1;
    private Integer totalPage = 1;

    @BindView(R.id.rv)
    public RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    public RefreshLayout refreshLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school_club, container, false);
        ButterKnife.bind(this, view);

        initView();

        initData();

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout r) {
                page = 1;
                initData();
                clubRecyclerAdapter.refresh();
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


        return view;
    }

    private void initView() {
        mapArrayList = new ArrayList<>();
        clubRecyclerAdapter = new ClubRecyclerAdapter(getContext(), mapArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(clubRecyclerAdapter);
    }

    private void initData() {
        if (page > totalPage) {
            return;
        }
        Call<ClubListBean> clubListBeanCall = RetrofitManager.getInstance().getApiService().getClubList(page);
        clubListBeanCall.enqueue(new Callback<ClubListBean>() {
            @Override
            public void onResponse(Call<ClubListBean> call, Response<ClubListBean> response) {
                ClubListBean clubListBean = response.body();
                page++;
                totalPage = clubListBean.getData().getTotalPage();
                List<ClubListBean.DataBeanX.DataBean> dataBeanList = clubListBean.getData().getData();
                List<Map<String, Object>> mapList = new ArrayList<>();
                for (ClubListBean.DataBeanX.DataBean dataBean : dataBeanList) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("logo", dataBean.getClub_logo());
                    map.put("title", dataBean.getClub_name());
                    mapList.add(map);
                }
                mapArrayList.addAll(mapList);
                clubRecyclerAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ClubListBean> call, Throwable t) {

            }
        });
    }

}
