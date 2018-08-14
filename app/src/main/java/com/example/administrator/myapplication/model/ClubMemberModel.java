package com.example.administrator.myapplication.model;

public class ClubMemberModel {
    private String mName;
    private String mAvatar;
    private int mTitle;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public String getTitle() {
        switch (mTitle) {
            case 0:
                return "粉丝";
            case 1:
                return "成员";
            case 2:
                return "管理员";
            default:
                return "";
        }
    }

    public void setTitle(int title) {
        mTitle = title;
    }
}
