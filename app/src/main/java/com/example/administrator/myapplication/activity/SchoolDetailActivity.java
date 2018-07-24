package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

import butterknife.ButterKnife;

public class SchoolDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_detail);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        int schoolId = intent.getIntExtra("schoolId", 1);
//        Toast.makeText(this, schoolId + "", Toast.LENGTH_SHORT).show();
    }
}
