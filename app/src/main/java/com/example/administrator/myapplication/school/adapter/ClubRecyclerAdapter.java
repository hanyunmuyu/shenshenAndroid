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
    private OnItemClickListener mOnItemClickListener;
    public ClubRecyclerAdapter(Context context, List<Map<String, Object>> mapList) {
        this.context = context;
        this.mapList = mapList;
    }

    @Override
    public ClubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ClubViewHolder clubViewHolder = new ClubViewHolder(LayoutInflater.from(context).inflate(R.layout.school_club_item, parent, false),mOnItemClickListener);
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

    public static class ClubViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.logo)
        public ImageView logo;

        @BindView(R.id.title)
        public TextView title;

        private OnItemClickListener mOnItemClickListener;
        public ClubViewHolder(View itemView,OnItemClickListener onItemClickListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mOnItemClickListener = onItemClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mOnItemClickListener.onItemClick(view,getPosition());
        }
    }
    public void refresh() {
        this.mapList.clear();
    }
    public interface OnItemClickListener{
        public void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }
}
