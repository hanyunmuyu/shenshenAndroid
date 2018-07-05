package com.example.administrator.myapplication.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.GlideImageLoader;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.ResponseInterface;
import com.example.administrator.myapplication.ResponseString;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private Retrofit retrofit;
    private RefreshLayout refreshLayout;
    private Banner banner;
    ArrayList<String> images = new ArrayList<>();


    private Handler handler;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        refreshLayout = (RefreshLayout) view.findViewById(R.id.refreshLayout);
        banner = (Banner) view.findViewById(R.id.banner);
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
//                    images.add("https://img.zecaifu.com//UF/Uploads/Ad/8c136fcdedf1c7f7bf55afca8a562192.jpg");
//                    images.add("https://img.zecaifu.com//UF/Uploads/Ad/8c136fcdedf1c7f7bf55afca8a562192.jpg");
//                    images.add("https://img.zecaifu.com//UF/Uploads/Ad/8c136fcdedf1c7f7bf55afca8a562192.jpg");
                    if (banner != null) {
                        banner.setImageLoader(new GlideImageLoader());
                        //设置图片集合
                        banner.setImages((List<?>) msg.obj);
                        banner.start();
                    }
                    refreshLayout.finishRefresh(100);
                }
            }
        };
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.zecaifu.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        initView();

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout r) {
                initView();
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
            }
        });


        return view;
    }

    private void initView() {
        ResponseInterface responseInterface = retrofit.create(ResponseInterface.class);
        Call<ResponseString> call = responseInterface.getCall();
        call.enqueue(new Callback<ResponseString>() {
            @Override
            public void onResponse(Call<ResponseString> call, Response<ResponseString> response) {
                ResponseString responseString = response.body();

                for (ResponseString.DataBean.AdContentBean adContentBean : responseString.getData().getAdContent()) {
                    images.add(adContentBean.getImg());
                }
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Message message = Message.obtain();
                        message.obj = images;
                        message.what = 1;
                        handler.sendMessage(message);
                    }
                }).start();
            }

            @Override
            public void onFailure(Call<ResponseString> call, Throwable t) {
            }
        });
    }

}
