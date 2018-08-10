package com.example.administrator.myapplication.clubDetail.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.clubDetail.adapter.MemberAdapter;
import com.example.administrator.myapplication.model.ClubMember;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MemberFragment extends Fragment {
    @BindView(R.id.rv)
    public RecyclerView mRecyclerView;

    private List<ClubMember> mClubMemberList;
    private MemberAdapter mMemberAdapter;

    public MemberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.club_detail_fragment_member, container, false);
        ButterKnife.bind(this, view);

        mClubMemberList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ClubMember clubMember = new ClubMember();
            clubMember.setName("寒云");
            if (i % 3 == 0) {
                clubMember.setTitle("管理员");
            }
            if (i % 2 == 0) {
                clubMember.setTitle("成员");
            }
            if (i % 4 == 0) {
                clubMember.setTitle("粉丝");
            }
            clubMember.setAvatar("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533896960302&di=d2cf2081014eb0d103db58654115b17b&imgtype=0&src=http%3A%2F%2Fi3.letvimg.com%2Flc04_isvrs%2F201610%2F02%2F06%2F58%2F83d0af2b-9941-4044-af9a-c1c76ab19eb2%2Fthumb%2F2_400_225.jpg");
            mClubMemberList.add(clubMember);
        }
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mMemberAdapter = new MemberAdapter(mClubMemberList, getContext());
        mRecyclerView.setAdapter(mMemberAdapter);

        return view;
    }

}
