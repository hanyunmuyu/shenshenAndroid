package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.school.adapter.ClubRecyclerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClubFragment extends Fragment {
    private ClubRecyclerAdapter clubRecyclerAdapter;
    private List<Map<String, Object>> mapList;
    private Unbinder unbinder;

    @BindView(R.id.rv)
    public RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school_club, container, false);
        unbinder = ButterKnife.bind(this, view);

        mapList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("logo", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531224143547&di=f84bf7148ec22a2c47018c3e2c3aa6e7&imgtype=0&src=http%3A%2F%2Fimg.yzcdn.cn%2Fupload_files%2F2015%2F02%2F13%2FFtmeFNDcH_nC1JFYUUQmdGfXCvFj.jpg");
            map.put("title", "轮滑社团");


            mapList.add(map);
        }

        clubRecyclerAdapter = new ClubRecyclerAdapter(getContext(), mapList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(clubRecyclerAdapter);
        return view;
    }
}
