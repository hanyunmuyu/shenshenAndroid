package com.example.administrator.myapplication.school.adapter;

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
import butterknife.ButterKnife;

public class ClubRecyclerAdapter extends RecyclerView.Adapter<ClubRecyclerAdapter.ClubViewHolder> {
    private Context context;
    private List<Map<String, Object>> mapList;

    public ClubRecyclerAdapter(Context context, List<Map<String, Object>> mapList) {
        this.context = context;
        this.mapList = mapList;
    }

    @Override
    public ClubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ClubViewHolder clubViewHolder = new ClubViewHolder(LayoutInflater.from(context).inflate(R.layout.school_club_item, parent, false));
        return clubViewHolder;
    }

    @Override
    public void onBindViewHolder(ClubViewHolder holder, int position) {
        Map<String, Object> map = mapList.get(position);
        Picasso.get().load((String) map.get("logo")).into(holder.logo);
        holder.title.setText((String) map.get("title"));
    }

    @Override
    public int getItemCount() {
        return mapList == null ? 0 : mapList.size();
    }

    public static class ClubViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.logo)
        public ImageView logo;

        @BindView(R.id.title)
        public TextView title;

        public ClubViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void addData(List<Map<String, Object>> mapArrayList) {
        this.mapList.addAll(mapArrayList);
    }

    public void refresh() {
        this.mapList.clear();
    }
}
