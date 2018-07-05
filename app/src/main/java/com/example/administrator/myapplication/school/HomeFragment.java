package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.school.adapter.HomeRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school_home, container, false);
        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Map<String, Object>> mapArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            Map<String, Object> map = new ArrayMap<>();
            map.put("pic", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1530787601738&di=fadc5579bcd1e747db056df10cea82d4&imgtype=0&src=http%3A%2F%2Fimg.pconline.com.cn%2Fimages%2Fupload%2Fupc%2Ftx%2Fitbbs%2F1408%2F18%2Fc23%2F37570958_1408354006609_mthumb.jpg");
            map.put("name", "PLMM");
            map.put("title", "这个MM真靓");
            map.put("content", "这样的MM有谁喜欢呢？送你一打！哈哈哈哈");
            map.put("favoriteNumber", 100);
            map.put("collectionNumber", 1000);
            mapArrayList.add(map);
        }
        HomeRecyclerViewAdapter homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(mapArrayList, getContext());
        recyclerView.setAdapter(homeRecyclerViewAdapter);

        return view;
    }

}
