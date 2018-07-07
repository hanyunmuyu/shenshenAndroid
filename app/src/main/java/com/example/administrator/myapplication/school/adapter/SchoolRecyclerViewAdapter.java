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
        Picasso.get().load((String) map.get("logo")).into(holder.logo);
        holder.schoolName.setText((String) map.get("schoolName"));
        holder.description.setText((String) map.get("description"));
        holder.favoriteNumber.setText(String.valueOf(map.get("favoriteNumber")));
        holder.clubNumber.setText(String.valueOf(map.get("clubNumber")));
    }

    @Override
    public int getItemCount() {
        return mapArrayList.size();
    }

    public class SchoolViewHolder extends RecyclerView.ViewHolder {
        public TextView schoolName;
        public TextView favoriteNumber;
        public TextView clubNumber;
        public TextView description;
        public ImageView logo;

        public SchoolViewHolder(View itemView) {
            super(itemView);
            schoolName = itemView.findViewById(R.id.schoolName);
            description = itemView.findViewById(R.id.description);
            logo = itemView.findViewById(R.id.logo);
            favoriteNumber = itemView.findViewById(R.id.favoriteNumber);
            clubNumber = itemView.findViewById(R.id.clubNumber);

        }
    }
}
