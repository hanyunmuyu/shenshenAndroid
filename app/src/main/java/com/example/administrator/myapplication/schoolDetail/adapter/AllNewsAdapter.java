package com.example.administrator.myapplication.schoolDetail.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.lib.CircleTransform;
import com.example.administrator.myapplication.myView.NineImageview;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
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
        Map<String, Object> map = mMapList.get(position);
        Picasso.get().load(R.mipmap.dog).transform(new CircleTransform()).into(holder.logo);
        holder.title.setText((String) map.get("title"));
        holder.addTime.setText((String) map.get("created_at"));
        holder.content.setText((String) map.get("content"));
        holder.mNineImageview.setLineNumber(3).setStringList((List<String>) map.get("imgList"));
    }

    @Override
    public int getItemCount() {
        return mMapList == null ? 0 : mMapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.logo)
        public ImageView logo;
        @BindView(R.id.title)
        public TextView title;
        @BindView(R.id.addTime)
        public TextView addTime;
        @BindView(R.id.content)
        public TextView content;
        @BindView(R.id.nineView)
        public NineImageview mNineImageview;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void refresh() {
        this.mMapList.clear();
    }

}
