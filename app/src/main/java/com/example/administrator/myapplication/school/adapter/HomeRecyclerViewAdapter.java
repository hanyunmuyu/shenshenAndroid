package com.example.administrator.myapplication.school.adapter;

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

import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.MyViewHolder> {
    private List<Map<String, Object>> mapArrayList;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public HomeRecyclerViewAdapter(List<Map<String, Object>> mapArrayList, Context context) {
        this.mapArrayList = mapArrayList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.school_home_item, parent, false), onItemClickListener);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Map<String, Object> map = mapArrayList.get(position);
        Picasso.get().load((String) map.get("pic")).transform(new CircleTransform()).into(holder.pic);
        holder.name.setText((String) map.get("name"));
        holder.addTime.setText((String) map.get("addTime"));
        holder.title.setText((String) map.get("title"));
        holder.content.setText((String) map.get("content"));
        holder.favoriteNumber.setText(String.valueOf(map.get("favoriteNumber")));
        holder.commentNumber.setText(String.valueOf(map.get("commentNumber")));
        holder.mNineImageview.setStringList((List<String>) map.get("imgList"));
    }

    @Override
    public int getItemCount() {
        return mapArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView pic;
        public TextView name;
        public TextView addTime;
        public TextView title;
        public TextView content;
        public TextView favoriteNumber;
        public TextView commentNumber;
        @BindView(R.id.nineView)
        public NineImageview mNineImageview;
        private OnItemClickListener onItemClickListener;

        public MyViewHolder(View itemView, OnItemClickListener onItemClickListener) {

            super(itemView);
            ButterKnife.bind(this, itemView);

            pic = itemView.findViewById(R.id.pic);
            name = itemView.findViewById(R.id.name);
            addTime = itemView.findViewById(R.id.addTime);
            title = itemView.findViewById(R.id.title);
            content = itemView.findViewById(R.id.content);
            favoriteNumber = itemView.findViewById(R.id.favoriteNumber);
            commentNumber = itemView.findViewById(R.id.commentNumber);
            this.onItemClickListener = onItemClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onItemClickListener.onItemClick(view, getPosition());
        }
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int postion);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
    public void refresh() {
        mapArrayList.clear();
    }
}
