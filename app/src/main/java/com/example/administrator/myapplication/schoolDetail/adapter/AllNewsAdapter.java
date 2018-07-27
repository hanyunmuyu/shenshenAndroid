package com.example.administrator.myapplication.schoolDetail.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;

import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;

public class AllNewsAdapter extends RecyclerView.Adapter<AllNewsAdapter.MyViewHolder> {
    private Context mContext;
    private List<Map<String, Object>> mMapList;

    public AllNewsAdapter(Context context, List<Map<String, Object>> mapList) {
        mContext = context;
        mMapList = mapList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.school_news_all, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mMapList == null ? 0 : mMapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void refresh() {
        this.mMapList.clear();
    }

}
