package com.example.administrator.myapplication.school.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

import java.util.List;
import java.util.Map;

public class SchoolRecyclerViewAdapter extends RecyclerView.Adapter<SchoolRecyclerViewAdapter.SchoolViewHolder> {


    private List<Map<String, Object>> mapArrayList;
    private Context context;

    public SchoolRecyclerViewAdapter(List<Map<String, Object>> mapArrayList, Context context) {
        this.mapArrayList = mapArrayList;
        this.context = context;
    }

    @Override
    public SchoolViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        SchoolViewHolder schoolViewHolder = new SchoolViewHolder(LayoutInflater.from(context).inflate(R.layout.school_school_item, parent, false));

        return schoolViewHolder;
    }

    @Override
    public void onBindViewHolder(SchoolViewHolder holder, int position) {
        Map<String, Object> map = mapArrayList.get(position);
        holder.textView.setText((String) map.get("title"));
    }

    @Override
    public int getItemCount() {
        return mapArrayList.size();
    }

    public class SchoolViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public SchoolViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
