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
import com.example.administrator.myapplication.bean.SchoolRecommendBean;
import com.example.administrator.myapplication.lib.RetrofitManager;
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
    private int page = 1;
    private int totalPage = 1;
    private HomeRecyclerViewAdapter homeRecyclerViewAdapter;
    private List<Map<String, Object>> mapArrayList;

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
        View view = inflater.inflate(R.layout.fragment_school_home, container, false);
        ButterKnife.bind(this, view);

        initView();
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout r) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(ScrollView.FOCUS_UP);
                    }
                }, 200);
                page = 1;
                initData();
                homeRecyclerViewAdapter.refresh();
                refreshLayout.finishRefresh(500);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                initData();
                refreshLayout.finishLoadMore(500);
            }
        });
        initData();
        return view;
    }

    private void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
            }
        }, 200);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mapArrayList = new ArrayList<>();
        homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(mapArrayList, getContext());
        homeRecyclerViewAdapter.setOnItemClickListener(new HomeRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(getContext(), postion + "", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(homeRecyclerViewAdapter);
    }

    private void initData() {
        if (page > totalPage) {
            return;
        }
        Call<SchoolRecommendBean> call = RetrofitManager.getInstance().getApiService(getContext()).getSchoolRecommendList(page);
        call.enqueue(new Callback<SchoolRecommendBean>() {
            @Override
            public void onResponse(Call<SchoolRecommendBean> call, Response<SchoolRecommendBean> response) {

                SchoolRecommendBean schoolRecommendBean = response.body();
                if (page == 1) {
                    List<String> stringList = new ArrayList<>();
                    for (SchoolRecommendBean.DataBeanX.PlayerBean playerBean : schoolRecommendBean.getData().getPlayer()) {
                        stringList.add(playerBean.getImage());
                    }
                    banner.setBannerStyle(BannerConfig.CENTER);
                    banner.setImageLoader(new GlideImageLoader());
                    //设置图片集合
                    banner.setImages(stringList);
                    banner.start();
                }
                totalPage = schoolRecommendBean.getData().getTotalPage();
                List<Map<String, Object>> mapList = new ArrayList<>();
                for (SchoolRecommendBean.DataBeanX.DataBean dataBean : schoolRecommendBean.getData().getData()) {
                    Map<String, Object> map = new ArrayMap<>();
                    map.put("pic", dataBean.getLogo());
                    map.put("addTime", dataBean.getCreated_at());
                    map.put("name", dataBean.getName());
                    map.put("title", dataBean.getTitle());
                    map.put("content", dataBean.getDescription());
                    map.put("imgList", dataBean.getImage_list());
                    map.put("favoriteNumber", 100);
                    map.put("collectionNumber", 1000);
                    map.put("commentNumber", 1000);
                    mapList.add(map);
                }
                mapArrayList.addAll(mapList);
                homeRecyclerViewAdapter.notifyDataSetChanged();
                if (page > 1) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                        }
                    }, 100);
                }
                page++;
            }

            @Override
            public void onFailure(Call<SchoolRecommendBean> call, Throwable t) {

            }
        });
    }
}
