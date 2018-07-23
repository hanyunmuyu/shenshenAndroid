package com.example.administrator.myapplication.bean;

import java.util.List;

public class ClubCategory {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : [{"id":1,"category_name":"体育","created_at":"","updated_at":""},{"id":2,"category_name":"绘画","created_at":"","updated_at":""},{"id":3,"category_name":"设计","created_at":"","updated_at":""},{"id":4,"category_name":"编程","created_at":"","updated_at":""},{"id":5,"category_name":"足球","created_at":"","updated_at":""},{"id":6,"category_name":"篮球","created_at":"","updated_at":""}]
     */

    private int code;
    private String status;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * category_name : 体育
         * created_at :
         * updated_at :
         */

        private int id;
        private String category_name;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
