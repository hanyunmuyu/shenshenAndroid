package com.example.administrator.myapplication.clubDetail.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.lib.CircleTransform;
import com.example.administrator.myapplication.model.ClubMember;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.MemberHolder> {
    private List<ClubMember> mClubMembers;
    private Context mContext;

    public MemberAdapter(List<ClubMember> clubMembers, Context context) {
        mClubMembers = clubMembers;
        mContext = context;
    }

    @Override
    public MemberHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.club_member, parent, false);
        MemberHolder memberHolder = new MemberHolder(view);
        return memberHolder;
    }

    @Override
    public void onBindViewHolder(MemberHolder holder, int position) {
        ClubMember clubMember = mClubMembers.get(position);
        Picasso.get().load(clubMember.getAvatar()).transform(new CircleTransform()).fit().centerCrop().into(holder.avatar);
        holder.title.setText(clubMember.getTitle());
        holder.name.setText(clubMember.getName());
    }

    @Override
    public int getItemCount() {
        return mClubMembers.size();
    }

    public class MemberHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.avatar)
        public ImageView avatar;
        @BindView(R.id.name)
        public TextView name;
        @BindView(R.id.title)
        public TextView title;

        public MemberHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
