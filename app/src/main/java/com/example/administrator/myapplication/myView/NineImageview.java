package com.example.administrator.myapplication.myView;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NineImageview extends ViewGroup {
    private List<String> mStringList;
    private int lineNumber = 3;
    private Handler mHandler = new Handler();

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
        for (int a = 0; a < mStringList.size(); a++) {
            final int d = a;
            final int index = a % lineNumber;
            final int c = (int) Math.floor(a / lineNumber);
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    int w = getWidth() / lineNumber;
                    ImageView imageView;
                    imageView = new ImageView(getContext());
                    addView(imageView);
                    imageView.setPadding(2, 2, 2, 2);
                    Picasso.get().load(mStringList.get(d)).fit().centerCrop().into(imageView);
                    imageView.layout(index * w, c * w, (index + 1) * w, (c + 1) * w);
                }
            });
            if (a >= mStringList.size()) {
                break;
            }
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
        int line = (int) Math.ceil(mStringList.size() / lineNumber);
        setMeasuredDimension(width, w * line);
    }
}
