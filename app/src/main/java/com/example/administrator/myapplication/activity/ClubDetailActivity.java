package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dyhdyh.widget.loading.dialog.LoadingDialog;
import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.BaseBean;
import com.example.administrator.myapplication.bean.ClubDetailBean;
import com.example.administrator.myapplication.clubDetail.adapter.ClubDetailAdapter;
import com.example.administrator.myapplication.clubDetail.fragment.AllFragment;
import com.example.administrator.myapplication.clubDetail.fragment.HotFragment;
import com.example.administrator.myapplication.clubDetail.fragment.MemberFragment;
import com.example.administrator.myapplication.lib.CropSquareTransformation;
import com.example.administrator.myapplication.lib.RetrofitManager;
import com.example.administrator.myapplication.lib.Token;
import com.example.administrator.myapplication.model.QrCodeModel;
import com.example.administrator.myapplication.myView.NineImageview;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClubDetailActivity extends FragmentActivity {

    @BindView(R.id.logo)
    public ImageView logo;
    @BindView(R.id.tab)
    public TabLayout mTabLayout;
    @BindView(R.id.vp)
    public ViewPager mViewPager;
    @BindView(R.id.payAttentionBtn)
    public Button payAttentionBtn;
    @BindView(R.id.description)
    public TextView description;
    @BindView(R.id.category)
    public LinearLayout category;

    private int clubId;
    private String[] mTitles = {"热门", "全部", "成员"};
    private List<Fragment> mFragmentList;
    private ClubDetailAdapter mClubDetailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_detail);
        ButterKnife.bind(this);
        clubId = getIntent().getExtras().getInt("clubId");
        initView();
        initData();
    }

    private void initView() {
        mFragmentList = new ArrayList<>();
        MemberFragment memberFragment = new MemberFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("clubId", clubId);
        memberFragment.setArguments(bundle);

        mFragmentList.add(new HotFragment());
        mFragmentList.add(new AllFragment());
        mFragmentList.add(memberFragment);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mClubDetailAdapter = new ClubDetailAdapter(getSupportFragmentManager(), mFragmentList, mTitles);
        mViewPager.setAdapter(mClubDetailAdapter);
        mViewPager.setOffscreenPageLimit(2);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initData() {
        Call<ClubDetailBean> call = RetrofitManager.getInstance().getApiService().getClubDetail(clubId);
        call.enqueue(new Callback<ClubDetailBean>() {
            @Override
            public void onResponse(Call<ClubDetailBean> call, Response<ClubDetailBean> response) {
                ClubDetailBean clubDetailBean = response.body();
                ClubDetailBean.DataBean.DetailBean dataBean = clubDetailBean.getData().getDetail();
                Picasso.get().load(dataBean.getClub_logo()).transform(new CropSquareTransformation()).fit().centerCrop().into(logo);
                description.setText(dataBean.getClub_description());
                if (dataBean.getIsAttented() == 1) {
                    payAttentionBtn.setText("已关注");
                    payAttentionBtn.setEnabled(false);
                }
                for (ClubDetailBean.DataBean.DetailBean.CategoriesBean categoriesBean : dataBean.getCategories()) {
                    TextView textView = new TextView(MainActivity.mContext);
                    textView.setText(categoriesBean.getCategory_name());
                    textView.setTextSize(16);
                    category.addView(textView);
                }
            }

            @Override
            public void onFailure(Call<ClubDetailBean> call, Throwable t) {

            }
        });
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

    @OnClick(R.id.payAttentionBtn)
    public void payAttention(View view) {
        LoadingDialog.make(this).show();
        Call<BaseBean> call = RetrofitManager.getInstance().getApiService().payAttentionToClub(clubId);
        call.enqueue(new Callback<BaseBean>() {
            @Override
            public void onResponse(Call<BaseBean> call, Response<BaseBean> response) {
                LoadingDialog.cancel();
                BaseBean baseBean = response.body();
                Token.getInstance().checkCode(MainActivity.mContext, baseBean.getCode());
                if (baseBean.getCode() == 200) {
                    payAttentionBtn.setText("已关注");
                    payAttentionBtn.setEnabled(false);
                }
            }

            @Override
            public void onFailure(Call<BaseBean> call, Throwable t) {

            }
        });
    }
}
