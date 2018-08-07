package com.example.administrator.myapplication.myView;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class NineImageview extends ViewGroup {
    private List<String> mStringList;
    private int lineNumber = 3;
    private List<ImageView> mImageViews = new ArrayList<>();
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String img = msg.getData().getString("img");
            int index = msg.getData().getInt("index");
            Picasso.get().load(img).fit().centerCrop().into(mImageViews.get(index));

        }
    };

    public NineImageview setStringList(List<String> stringList) {
        mStringList = stringList;
        return this;
    }

    public NineImageview setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    public NineImageview(Context context) {
        super(context);
    }

    public NineImageview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NineImageview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        int width = getWidth();
        int imgWidth = width / lineNumber;
        int a = 0;
        for (String img : mStringList) {
            int index = a % lineNumber;
            int line = (int) Math.ceil(a / lineNumber);
            ImageView imageView = new ImageView(getContext());
            imageView.setPadding(2, 2, 2, 2);
            addView(imageView);
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("img", img);
            bundle.putInt("index", a);
            message.setData(bundle);
            mHandler.sendMessage(message);
            mImageViews.add(imageView);
            imageView.layout(index * imgWidth, line * imgWidth, (index + 1) * imgWidth, (line + 1) * imgWidth);
            a++;
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int w = getWidth() / lineNumber;
        int line =(int) Math.ceil((float) mStringList.size() / lineNumber);
        setMeasuredDimension(width, line * w);
    }
}
