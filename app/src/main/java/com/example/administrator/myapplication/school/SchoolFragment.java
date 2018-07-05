package com.example.administrator.myapplication.school;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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

        List<Map<String, Object>> mapArrayList=new ArrayList<>();
        for (int i=0;i<16;i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("title", "今天天气不错！一起去踏青！");
            mapArrayList.add(map);
        }
        schoolRecyclerViewAdapter = new SchoolRecyclerViewAdapter(mapArrayList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(schoolRecyclerViewAdapter);
        return view;
    }

}
