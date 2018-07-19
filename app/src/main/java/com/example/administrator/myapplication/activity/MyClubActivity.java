package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.club.adapter.MyClubAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyClubActivity extends Activity {
    private MyClubAdapter myClubAdapter;
    private List<Map<String, Object>> mMapList;
    @BindView(R.id.rv)
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_club);
        ButterKnife.bind(this);
        initData();
        initView();

    }

    private void initData() {
        mMapList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("logo", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531979149414&di=d0316a69c1667208763e1f1210864394&imgtype=0&src=http%3A%2F%2Fd15.lxyes.com%2F15xm%2Fact%2F20151105%2F20%2F99112408.jpg");
            map.put("title", "社团社团社团");
            map.put("description", "社团描述社团描述社团描述社团描述社团描述");
            mMapList.add(map);
        }
    }

    private void initView() {
        myClubAdapter = new MyClubAdapter(this, mMapList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myClubAdapter);
    }

    @OnClick(R.id.backBtn)
    public void back() {
        finish();
    }

    @OnClick(R.id.createClubBtn)
    public void createClub() {
        startActivity(new Intent(this, CreateClubActivity.class));
    }
}
