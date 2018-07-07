package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.school.adapter.SchoolRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment {
    private RecyclerView recyclerView;
    private SchoolRecyclerViewAdapter schoolRecyclerViewAdapter;

    public SchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school_school, container, false);
        recyclerView = view.findViewById(R.id.rv);

        List<Map<String, Object>> mapArrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("schoolName", "河南工业大学");
            map.put("description", "河南工业大学简介");
            map.put("logo", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531464722&di=326def83e48395c00d068bd9049d9bca&imgtype=jpg&er=1&src=http%3A%2F%2Fcollege.koolearn.com%2Fupload%2Fschool%2Fkaoyan%2F10463.jpg");
            map.put("favoriteNumber", 100000);
            map.put("clubNumber", 100);
            mapArrayList.add(map);
        }
        schoolRecyclerViewAdapter = new SchoolRecyclerViewAdapter(mapArrayList, getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(schoolRecyclerViewAdapter);
        return view;
    }

}
