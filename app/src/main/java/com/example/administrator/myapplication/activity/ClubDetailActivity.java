package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.clubDetail.adapter.ClubDetailAdapter;
import com.example.administrator.myapplication.clubDetail.fragment.AllFragment;
import com.example.administrator.myapplication.clubDetail.fragment.HotFragment;
import com.example.administrator.myapplication.clubDetail.fragment.MemberFragment;
import com.example.administrator.myapplication.model.QrCodeModel;
import com.example.administrator.myapplication.myView.NineImageview;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClubDetailActivity extends FragmentActivity {

    @BindView(R.id.logo)
    public ImageView logo;
    @BindView(R.id.tab)
    public TabLayout mTabLayout;
    @BindView(R.id.vp)
    public ViewPager mViewPager;


    private int clubId;
    private String[] mTitles = {"热门", "全部", "成员"};
    private List<Fragment> mFragmentList;
    private ClubDetailAdapter mClubDetailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_detail);
        ButterKnife.bind(this);
//        this.clubId = getIntent().getExtras().getInt("ClubId");
        this.clubId = 1;
        initView();
    }

    private void initView() {
        Picasso.get().load(R.mipmap.dog).fit().centerCrop().into(logo);
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new MemberFragment());
        mFragmentList.add(new HotFragment());
        mFragmentList.add(new AllFragment());
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mClubDetailAdapter = new ClubDetailAdapter(getSupportFragmentManager(), mFragmentList, mTitles);
        mViewPager.setAdapter(mClubDetailAdapter);
        mViewPager.setOffscreenPageLimit(2);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @OnClick(R.id.qr)
    public void showQr() {
        Intent intent = new Intent(this, QrCodeActivity.class);
        Bundle bundle = new Bundle();
        QrCodeModel qrCodeModel = new QrCodeModel();
        qrCodeModel.setTitle("莘莘");
        qrCodeModel.setContent("aaaaaaaaaa");
        qrCodeModel.setPic("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999815&di=e1a5bf060bb5ead19ba8055508a0bdec&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dpixel_huitu%252C0%252C0%252C294%252C40%2Fsign%3Dc5f68d1bb81bb0519b29bb685f02bfd8%2F10dfa9ec8a1363270e51430a9a8fa0ec08fac74f.jpg");
        bundle.putSerializable("code", qrCodeModel);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @OnClick(R.id.backBtn)
    public void back() {
        finish();
    }
}
