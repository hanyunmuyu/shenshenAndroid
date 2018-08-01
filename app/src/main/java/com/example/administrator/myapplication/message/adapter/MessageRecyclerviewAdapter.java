package com.example.administrator.myapplication.message.adapter;

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

public class MessageRecyclerviewAdapter extends RecyclerView.Adapter<MessageRecyclerviewAdapter.MessageViewHolder> {
    private Context mContext;
    private List<Map<String, Object>> mMapList;

    public MessageRecyclerviewAdapter(Context context, List<Map<String, Object>> mapList) {
        mContext = context;
        mMapList = mapList;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.message_message_item, parent, false);
        MessageViewHolder messageViewHolder = new MessageViewHolder(view);
        return messageViewHolder;
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        Map<String, Object> map = mMapList.get(position);
        holder.title.setText((String) map.get("title"));
        holder.name.setText((String) map.get("name"));
        Picasso.get().load((String) map.get("logo")).into(holder.logo);
        holder.addTime.setText((String) map.get("created_at"));
    }

    @Override
    public int getItemCount() {
        return mMapList == null ? 0 : mMapList.size();
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.logo)
        public ImageView logo;
        @BindView(R.id.name)
        public TextView name;
        @BindView(R.id.title)
        public TextView title;
        @BindView(R.id.addTime)
        public TextView addTime;

        public MessageViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    public void refresh() {
        mMapList.clear();
    }
}
