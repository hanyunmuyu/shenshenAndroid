package com.example.administrator.myapplication.club.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MyClubAdapter extends RecyclerView.Adapter<MyClubAdapter.MyViewHolder> {
    private Context mContext;
    private List<Map<String, Object>> mMapList;

    public MyClubAdapter(Context context, List<Map<String, Object>> mapList) {
        mContext = context;
        mMapList = mapList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.my_club_item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Map<String, Object> map = mMapList.get(position);
        Picasso.get().load((String) map.get("logo")).into(holder.logo);
        holder.title.setText((String) map.get("title"));
        holder.description.setText((String) map.get("description"));
    }

    @Override
    public int getItemCount() {
        return mMapList == null ? 0 : mMapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        public TextView title;

        @BindView(R.id.description)
        public TextView description;

        @BindView(R.id.logo)
        public ImageView logo;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
