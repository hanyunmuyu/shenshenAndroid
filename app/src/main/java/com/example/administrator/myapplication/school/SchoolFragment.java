package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.api.Api;
import com.example.administrator.myapplication.api.ApiService;
import com.example.administrator.myapplication.bean.SchoolListBean;
import com.example.administrator.myapplication.school.adapter.SchoolRecyclerViewAdapter;
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
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment {
    private SchoolRecyclerViewAdapter schoolRecyclerViewAdapter;
    private List<Map<String, Object>> mapArrayList;
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
        View view = inflater.inflate(R.layout.fragment_school_school, container, false);
        ButterKnife.bind(this, view);

        mapArrayList = new ArrayList<>();
        schoolRecyclerViewAdapter = new SchoolRecyclerViewAdapter(mapArrayList, getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(schoolRecyclerViewAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.API_USRL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);

        init();

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout r) {
                page = 1;
                init();
                schoolRecyclerViewAdapter.refresh();
                refreshLayout.finishRefresh(500);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout r) {
                init();
                refreshLayout.finishLoadMore(500);
            }
        });
        return view;
    }

    private void init() {
        if (page > totalPage) {
            return;
        }
        Call<SchoolListBean> call = apiService.getSchoolList(page);
        call.enqueue(new Callback<SchoolListBean>() {
            @Override
            public void onResponse(Call<SchoolListBean> call, Response<SchoolListBean> response) {
                SchoolListBean schoolListBean = response.body();
                page++;
                totalPage = schoolListBean.getData().getTotalPage();
                List<SchoolListBean.DataBeanX.DataBean> dataBeanList = schoolListBean.getData().getData();
                List<Map<String, Object>> mapList=new ArrayList<>();
                for (SchoolListBean.DataBeanX.DataBean dataBean : dataBeanList) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("schoolName", dataBean.getSchool_name());
                    map.put("description", dataBean.getSchool_description());
                    map.put("logo", dataBean.getSchool_logo());
                    map.put("favoriteNumber", dataBean.getFavorite_number());
                    map.put("clubNumber", dataBean.getClub_number());
                    mapList.add(map);
                }
                mapArrayList.addAll(mapList);
                schoolRecyclerViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<SchoolListBean> call, Throwable t) {

            }
        });
    }
}
