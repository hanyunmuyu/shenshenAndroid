package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.contrarywind.interfaces.IPickerViewData;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.bean.SchoolAllBean;
import com.example.administrator.myapplication.lib.RetrofitManager;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserActivity extends Activity {

    @BindView(R.id.schoolName)
    public TextView schoolName;

    private ArrayList<School> mSchoolBeans = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
        initData();
    }

    private class School implements IPickerViewData {
        @Override
        public String getPickerViewText() {
            return name;
        }

        private String name;
        private int id;

        public School(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    private void initData() {
        Call<SchoolAllBean> call = RetrofitManager.getInstance().getApiService(this).getAllSchool();
        call.enqueue(new Callback<SchoolAllBean>() {
            @Override
            public void onResponse(Call<SchoolAllBean> call, Response<SchoolAllBean> response) {
                SchoolAllBean schoolAllBean = response.body();
                for (SchoolAllBean.DataBean dataBean : schoolAllBean.getData()) {
                    School school = new School(dataBean.getSchool_name(), dataBean.getId());
                    mSchoolBeans.add(school);
                }
            }

            @Override
            public void onFailure(Call<SchoolAllBean> call, Throwable t) {

            }
        });
    }

    private void pick() {
        OptionsPickerView pvOptions = new OptionsPickerBuilder(this, new OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int option2, int options3, View v) {
                schoolName.setText(mSchoolBeans.get(options1).getPickerViewText());
            }
        }).setTitleText("选择校园")
                .setContentTextSize(20)//设置滚轮文字大小
                .setDividerColor(Color.LTGRAY)//设置分割线的颜色
                .setSelectOptions(0, 1)//默认选中项
                .build();
        pvOptions.setPicker(mSchoolBeans);
        pvOptions.show();
    }

    @OnClick(R.id.schoolName)
    public void click() {
        pick();
    }
}
