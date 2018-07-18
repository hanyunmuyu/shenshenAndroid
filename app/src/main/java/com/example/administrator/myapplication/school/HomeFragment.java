package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.administrator.myapplication.BaseFragment;
import com.example.administrator.myapplication.GlideImageLoader;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.api.ApiService;
import com.example.administrator.myapplication.bean.HomeBean;
import com.example.administrator.myapplication.school.adapter.HomeRecyclerViewAdapter;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
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
public class HomeFragment extends BaseFragment {
    private ArrayList<String> stringList;
    public Retrofit retrofit;
    public ApiService api;
    private Integer page = 1;

    @BindView(R.id.rv)
    public RecyclerView recyclerView;
    @BindView(R.id.banner)
    public Banner banner;
    @BindView(R.id.refreshLayout)
    public RefreshLayout refreshLayout;
    @BindView(R.id.scrollView)
    public ScrollView scrollView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school_home, container, false);
        ButterKnife.bind(this, view);

        stringList = new ArrayList<>();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.zecaifu.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(ApiService.class);

        initView();
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout r) {
                initView();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                loadMore();
                refreshLayout.finishLoadMore(1000);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Map<String, Object>> mapArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            Map<String, Object> map = new ArrayMap<>();
            map.put("pic", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1530787601738&di=fadc5579bcd1e747db056df10cea82d4&imgtype=0&src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fitbbs%2F1408%2F18%2Fc23%2F37570958_1408354006609_mthumb.jpg");
            map.put("addTime", "2018-07-05 23:19");
            map.put("name", "PLMM");
            map.put("title", "这个MM真靓");
            map.put("content", "这样的MM有谁喜欢呢？送你一打！哈哈哈哈这样的MM有谁喜欢呢？送你一打！哈哈哈哈这样的MM有谁喜欢呢？送你一打！哈哈哈哈");
            map.put("favoriteNumber", 100);
            map.put("collectionNumber", 1000);
            map.put("commentNumber", 1000);
            mapArrayList.add(map);
        }
        HomeRecyclerViewAdapter homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(mapArrayList, getContext());
        homeRecyclerViewAdapter.setOnItemClickListener(new HomeRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(getContext(), postion + "", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(homeRecyclerViewAdapter);

        return view;
    }

    private void initView() {
        page = 1;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
            }
        }, 200);

        Call<HomeBean> call = api.getHomeData(page);
        call.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                HomeBean homeBean = response.body();
                for (HomeBean.DataBean.AdContentBean adContentBean : homeBean.getData().getAdContent()) {
                    stringList.add(adContentBean.getImg());
                }
                banner.setBannerStyle(BannerConfig.CENTER);
                banner.setImageLoader(new GlideImageLoader());
                //设置图片集合
                banner.setImages(stringList);
                banner.start();
                refreshLayout.finishRefresh();
                page = 2;
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

            }
        });
    }

    private void loadMore() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
            }
        }, 200);
        Call<HomeBean> call = api.getHomeData(page);
        call.enqueue(new Callback<HomeBean>() {
            @Override
            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
                page++;
            }

            @Override
            public void onFailure(Call<HomeBean> call, Throwable t) {

            }
        });
    }
}
