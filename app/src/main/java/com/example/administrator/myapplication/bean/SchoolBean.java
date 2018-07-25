package com.example.administrator.myapplication.bean;

public class SchoolBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"id":1,"school_name":"河南工业大学-0","school_logo":"/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"","favorite_number":100,"club_number":1,"created_at":"2018-07-25 15:23:39","updated_at":"2018-07-25 15:23:39","isAttention":0}
     */

    private int code;
    private String status;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * school_name : 河南工业大学-0
         * school_logo : /uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg
         * school_description :
         * favorite_number : 100
         * club_number : 1
         * created_at : 2018-07-25 15:23:39
         * updated_at : 2018-07-25 15:23:39
         * isAttention : 0
         */

        private int id;
        private String school_name;
        private String school_logo;
        private String school_description;
        private int favorite_number;
        private int club_number;
        private String created_at;
        private String updated_at;
        private int isAttention;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSchool_name() {
            return school_name;
        }

        public void setSchool_name(String school_name) {
            this.school_name = school_name;
        }

        public String getSchool_logo() {
            return school_logo;
        }

        public void setSchool_logo(String school_logo) {
            this.school_logo = school_logo;
        }

        public String getSchool_description() {
            return school_description;
        }

        public void setSchool_description(String school_description) {
            this.school_description = school_description;
        }

        public int getFavorite_number() {
            return favorite_number;
        }

        public void setFavorite_number(int favorite_number) {
            this.favorite_number = favorite_number;
        }

        public int getClub_number() {
            return club_number;
        }

        public void setClub_number(int club_number) {
            this.club_number = club_number;
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

        public int getIsAttention() {
            return isAttention;
        }

        public void setIsAttention(int isAttention) {
            this.isAttention = isAttention;
        }
    }
}
