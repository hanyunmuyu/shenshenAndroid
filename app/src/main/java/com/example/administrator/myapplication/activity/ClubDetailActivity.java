package com.example.administrator.myapplication.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.administrator.myapplication.MainActivity;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.model.QrCodeModel;
import com.example.administrator.myapplication.myView.NineImageview;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClubDetailActivity extends Activity {

    @BindView(R.id.nineView)
    public NineImageview mNineImageview;


    private int clubId;

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
        List<String> list = new ArrayList<>();
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999816&di=e7525b5077067da3326990fda7998281&imgtype=0&src=http%3A%2F%2Fwww.officedoyen.com%2Fuploads%2Fallimg%2F140929%2F1-140929230255201.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999815&di=e1a5bf060bb5ead19ba8055508a0bdec&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dpixel_huitu%252C0%252C0%252C294%252C40%2Fsign%3Dc5f68d1bb81bb0519b29bb685f02bfd8%2F10dfa9ec8a1363270e51430a9a8fa0ec08fac74f.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999815&di=e1a5bf060bb5ead19ba8055508a0bdec&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dpixel_huitu%252C0%252C0%252C294%252C40%2Fsign%3Dc5f68d1bb81bb0519b29bb685f02bfd8%2F10dfa9ec8a1363270e51430a9a8fa0ec08fac74f.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999815&di=e1a5bf060bb5ead19ba8055508a0bdec&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dpixel_huitu%252C0%252C0%252C294%252C40%2Fsign%3Dc5f68d1bb81bb0519b29bb685f02bfd8%2F10dfa9ec8a1363270e51430a9a8fa0ec08fac74f.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999816&di=e7525b5077067da3326990fda7998281&imgtype=0&src=http%3A%2F%2Fwww.officedoyen.com%2Fuploads%2Fallimg%2F140929%2F1-140929230255201.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533727999815&di=e1a5bf060bb5ead19ba8055508a0bdec&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dpixel_huitu%252C0%252C0%252C294%252C40%2Fsign%3Dc5f68d1bb81bb0519b29bb685f02bfd8%2F10dfa9ec8a1363270e51430a9a8fa0ec08fac74f.jpg");
        mNineImageview.setStringList(list).setLineNumber(3);
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
}
