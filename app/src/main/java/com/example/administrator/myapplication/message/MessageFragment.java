package com.example.administrator.myapplication.message;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.MessageBean;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.message.adapter.MessageRecyclerviewAdapter;
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

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends Fragment {

    @BindView(R.id.fresh)
    public RefreshLayout mRefreshLayout;
    @BindView(R.id.rv)
    public RecyclerView mRecyclerView;


    private int page = 0;
    private MessageRecyclerviewAdapter mMessageRecyclerviewAdapter;
    private List<Map<String, Object>> mMapList;

    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message_message, container, false);
        ButterKnife.bind(this, view);

        initView();

        initData();


        return view;
    }

    private void initView() {
        mMapList = new ArrayList<>();

        mMessageRecyclerviewAdapter = new MessageRecyclerviewAdapter(getContext(), mMapList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mMessageRecyclerviewAdapter);

        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                initData();
                mRefreshLayout.finishRefresh(500);
                mMessageRecyclerviewAdapter.refresh();
            }
        });

        mRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                initData();
                mRefreshLayout.finishLoadMore(500);
            }
        });
    }

    private void initData() {
        Call<MessageBean> call = RetrofitManager.getInstance().getApiService(getContext()).getUserMessage(page);
        call.enqueue(new Callback<MessageBean>() {
            @Override
            public void onResponse(Call<MessageBean> call, Response<MessageBean> response) {
                MessageBean messageBean = response.body();
                messageBean.getData().getData();
                List<Map<String, Object>> mapList = new ArrayList<>();
                for (MessageBean.DataBeanX.DataBean dataBean : messageBean.getData().getData()) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("logo", dataBean.getLogo());
                    map.put("name", dataBean.getName());
                    map.put("title", dataBean.getTitle());
                    map.put("created_at", dataBean.getCreated_at());
                    mapList.add(map);
                }
                mMapList.addAll(mapList);
                mMessageRecyclerviewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<MessageBean> call, Throwable t) {

            }
        });
    }
}
