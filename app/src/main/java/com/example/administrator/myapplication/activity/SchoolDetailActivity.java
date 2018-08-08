package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dyhdyh.widget.loading.dialog.LoadingDialog;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.BaseBean;
import com.example.administrator.myapplication.bean.SchoolBean;
import com.example.administrator.myapplication.lib.CropSquareTransformation;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.lib.Token;
import com.example.administrator.myapplication.schoolDetail.adapter.SchoolDetailAdapter;
import com.example.administrator.myapplication.schoolDetail.fragment.AllFragment;
import com.example.administrator.myapplication.schoolDetail.fragment.BestFragment;
import com.example.administrator.myapplication.schoolDetail.fragment.HotFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SchoolDetailActivity extends FragmentActivity {
    @BindView(R.id.tl)
    public TabLayout mTabLayout;
    @BindView(R.id.vp)
    public ViewPager mViewPager;
    @BindView(R.id.signInBtn)
    public Button signInBtn;
    @BindView(R.id.payAttentionBtn)
    public Button payAttentionBtn;
    @BindView(R.id.logo)
    public ImageView logo;
    @BindView(R.id.schoolName)
    public TextView schoolName;
    @BindView(R.id.schoolDescription)
    public TextView schoolDescription;
    @BindView(R.id.schoolTitle)
    public TextView schoolTitle;

    @BindView(R.id.clubNumber)
    public TextView clubNumber;
    @BindView(R.id.departmentNumber)
    public TextView departmentNumber;
    @BindView(R.id.attentionNumber)
    public TextView attentionNumber;
    @BindView(R.id.clubBtn)
    public RelativeLayout clubBtn;

    private String[] mTitles = {"全部", "热门", "精华"};
    private SchoolDetailAdapter mSchoolDetailAdapter;
    private List<Fragment> mFragmentList;
    private int schoolId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_detail);
        ButterKnife.bind(this);
        initData();
        initView();
    }

    private void initData() {
        Bundle bundle = getIntent().getExtras();
        this.schoolId = bundle.getInt("schoolId");
//        this.schoolId = 1;
        Call<SchoolBean> call = RetrofitManager.getInstance().getApiService(this).getSchoolDetail(schoolId);
        call.enqueue(new Callback<SchoolBean>() {
            @Override
            public void onResponse(Call<SchoolBean> call, Response<SchoolBean> response) {
                SchoolBean schoolBean = response.body();
                SchoolBean.DataBean dataBean = schoolBean.getData();

                Picasso.get().load(dataBean.getSchool_logo()).transform(new CropSquareTransformation()).into(logo);
                schoolName.setText(dataBean.getSchool_name());
                schoolDescription.setText(dataBean.getSchool_description());
                clubNumber.setText(String.valueOf(schoolBean.getData().getClub_number()));
                departmentNumber.setText(String.valueOf(schoolBean.getData().getDeparment_number()));
                attentionNumber.setText(String.valueOf(schoolBean.getData().getAttention_number()));
                schoolTitle.setText(schoolBean.getData().getSchool_name());
                if (dataBean.getIsSignIn() == 1) {
                    signInBtn.setText("已签到");
                    signInBtn.setEnabled(false);
                }


                if (dataBean.getIsAttention() == 0) {
                    payAttentionBtn.setVisibility(View.VISIBLE);
                    signInBtn.setVisibility(View.GONE);
                } else {
                    payAttentionBtn.setVisibility(View.GONE);
                    signInBtn.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onFailure(Call<SchoolBean> call, Throwable t) {

            }
        });
    }

    private void initView() {
        mFragmentList = new ArrayList<>();
        mFragmentList.add(new AllFragment(schoolId));
        mFragmentList.add(new HotFragment());
        mFragmentList.add(new BestFragment());
        mSchoolDetailAdapter = new SchoolDetailAdapter(getSupportFragmentManager(), mFragmentList, mTitles);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mViewPager.setAdapter(mSchoolDetailAdapter);
        mViewPager.setOffscreenPageLimit(2);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @OnClick(R.id.payAttentionBtn)
    public void payAttention(View view) {
        LoadingDialog.make(this).show();
        Call<BaseBean> call = RetrofitManager.getInstance().getApiService(this).payAttentionToSchool(schoolId);
        call.enqueue(new Callback<BaseBean>() {
            @Override
            public void onResponse(Call<BaseBean> call, Response<BaseBean> response) {
                LoadingDialog.cancel();
                BaseBean baseBean = response.body();
                new Token().checkCode(getApplicationContext(), baseBean.getCode());
                if (baseBean.getCode() == 200) {
                    if (signInBtn.getVisibility() == View.VISIBLE) {
                        payAttentionBtn.setVisibility(View.GONE);
                    } else {
                        signInBtn.setVisibility(View.VISIBLE);
                    }

                    if (payAttentionBtn.getVisibility() == View.VISIBLE) {
                        payAttentionBtn.setVisibility(View.GONE);
                        signInBtn.setVisibility(View.VISIBLE);
                    } else {
                        signInBtn.setVisibility(View.GONE);
                        payAttentionBtn.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onFailure(Call<BaseBean> call, Throwable t) {
            }
        });
    }

    @OnClick(R.id.backBtn)
    public void back() {
        finish();
    }

    @OnClick(R.id.signInBtn)
    public void signIn(View view) {
        LoadingDialog.make(this).show();

        Call<BaseBean> call = RetrofitManager.getInstance().getApiService(this).signIn(schoolId);
        call.enqueue(new Callback<BaseBean>() {
            @Override
            public void onResponse(Call<BaseBean> call, Response<BaseBean> response) {
                LoadingDialog.cancel();
                BaseBean baseBean = response.body();
                signInBtn.setEnabled(false);
                signInBtn.setText("已签到");
            }

            @Override
            public void onFailure(Call<BaseBean> call, Throwable t) {

            }
        });
    }

    @OnClick(R.id.clubBtn)
    public void SchoolClub() {
        Intent intent = new Intent(getApplicationContext(), SchoolClubActivity.class);
        startActivity(intent);
    }
}
