package com.example.administrator.myapplication.bean;

import java.util.List;

public class UploadBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : [{"origin_name":"mm.jpg","id":1,"attachment_path":"/uploads/2018-07-18/20180718154946243.jpg"},{"origin_name":"mm.jpg","id":2,"attachment_path":"/uploads/2018-07-18/20180718154946856.jpg"}]
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
         * origin_name : mm.jpg
         * id : 1
         * attachment_path : /uploads/2018-07-18/20180718154946243.jpg
         */

        private String origin_name;
        private int id;
        private String attachment_path;

        public String getOrigin_name() {
            return origin_name;
        }

        public void setOrigin_name(String origin_name) {
            this.origin_name = origin_name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAttachment_path() {
            return attachment_path;
        }

        public void setAttachment_path(String attachment_path) {
            this.attachment_path = attachment_path;
        }
    }
}
