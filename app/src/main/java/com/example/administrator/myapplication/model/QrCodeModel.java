package com.example.administrator.myapplication.model;

import java.io.Serializable;

public class QrCodeModel implements Serializable {

    private String mPic;
    private String mTitle;
    private String mContent;

    public String getPic() {
        return mPic;
    }

    public void setPic(String pic) {
        mPic = pic;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }
}
