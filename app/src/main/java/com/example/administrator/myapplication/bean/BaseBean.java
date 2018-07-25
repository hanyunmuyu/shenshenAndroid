package com.example.administrator.myapplication.bean;

import java.util.List;

public class BaseBean {

    /**
     * code : 200
     * status : success
     * msg : 关注成功
     * data : []
     */

    private int code;
    private String status;
    private String msg;
    private List<?> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
