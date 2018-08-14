package com.example.administrator.myapplication.clubDetail.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.ClubDetailBean;
import com.example.administrator.myapplication.bean.ClubUserBean;
import com.example.administrator.myapplication.clubDetail.adapter.MemberAdapter;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.model.ClubMemberModel;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class MemberFragment extends Fragment {
    @BindView(R.id.rv)
    public RecyclerView mRecyclerView;
    @BindView(R.id.fresh)
    public SmartRefreshLayout mSmartRefreshLayout;

    private List<ClubMemberModel> mClubMemberModelList;
    private MemberAdapter mMemberAdapter;
    private int clubId;
    private int page = 1;
    private int totalPage = 1;

    public MemberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.club_detail_fragment_member, container, false);
        ButterKnife.bind(this, view);

        mClubMemberModelList = new ArrayList<>();
        initView();
        initData();

        return view;
    }

    private void initView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mMemberAdapter = new MemberAdapter(mClubMemberModelList, getContext());
        mRecyclerView.setAdapter(mMemberAdapter);
        mSmartRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                initData();
                mSmartRefreshLayout.finishLoadMore(500);
            }
        });
        mSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;
                initData();
                mSmartRefreshLayout.finishRefresh(500);
            }
        });
    }

    private void initData() {
        if (page > totalPage) {
            return;
        }
        Call<ClubUserBean> clubUserBeanCall = RetrofitManager.getInstance().getApiService().getClubMember(clubId, page);
        clubUserBeanCall.enqueue(new Callback<ClubUserBean>() {
            @Override
            public void onResponse(Call<ClubUserBean> call, Response<ClubUserBean> response) {
                ClubUserBean clubUserBean = response.body();
                totalPage = clubUserBean.getData().getTotalPage();
                for (ClubUserBean.DataBeanX.DataBean dataBean : clubUserBean.getData().getData()) {
                    ClubMemberModel clubMemberModel = new ClubMemberModel();
                    clubMemberModel.setName(dataBean.getName());
                    clubMemberModel.setAvatar(dataBean.getAvatar());
                    clubMemberModel.setTitle(dataBean.getLevel());
                    mClubMemberModelList.add(clubMemberModel);
                }
                mMemberAdapter.notifyDataSetChanged();
                page++;
            }

            @Override
            public void onFailure(Call<ClubUserBean> call, Throwable t) {

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        clubId = getArguments().getInt("clubId");
    }
}
