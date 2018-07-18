package com.example.administrator.myapplication.bean;

public class UserBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"id":1,"name":"i0n2dI","nick_name":"","avatar":"","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","gender":3,"school_id":44,"is_auth":0,"created_at":"","updated_at":"2018-07-18 14:22:19","api_token":"$2y$10$iLgoE/oKxeoEBx/6F5V/HuiZDcVJrbdsSZToQqhAh8JE3P4WbL6cK"}
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
         * name : i0n2dI
         * nick_name :
         * avatar :
         * true_name :
         * id_card_number :
         * id_card_a :
         * id_card_b :
         * student_card_a :
         * student_card_b :
         * student_number :
         * phone :
         * gender : 3
         * school_id : 44
         * is_auth : 0
         * created_at :
         * updated_at : 2018-07-18 14:22:19
         * api_token : $2y$10$iLgoE/oKxeoEBx/6F5V/HuiZDcVJrbdsSZToQqhAh8JE3P4WbL6cK
         */

        private int id;
        private String name;
        private String nick_name;
        private String avatar;
        private String true_name;
        private String id_card_number;
        private String id_card_a;
        private String id_card_b;
        private String student_card_a;
        private String student_card_b;
        private String student_number;
        private String phone;
        private int gender;
        private int school_id;
        private int is_auth;
        private String created_at;
        private String updated_at;
        private String api_token;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getTrue_name() {
            return true_name;
        }

        public void setTrue_name(String true_name) {
            this.true_name = true_name;
        }

        public String getId_card_number() {
            return id_card_number;
        }

        public void setId_card_number(String id_card_number) {
            this.id_card_number = id_card_number;
        }

        public String getId_card_a() {
            return id_card_a;
        }

        public void setId_card_a(String id_card_a) {
            this.id_card_a = id_card_a;
        }

        public String getId_card_b() {
            return id_card_b;
        }

        public void setId_card_b(String id_card_b) {
            this.id_card_b = id_card_b;
        }

        public String getStudent_card_a() {
            return student_card_a;
        }

        public void setStudent_card_a(String student_card_a) {
            this.student_card_a = student_card_a;
        }

        public String getStudent_card_b() {
            return student_card_b;
        }

        public void setStudent_card_b(String student_card_b) {
            this.student_card_b = student_card_b;
        }

        public String getStudent_number() {
            return student_number;
        }

        public void setStudent_number(String student_number) {
            this.student_number = student_number;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getSchool_id() {
            return school_id;
        }

        public void setSchool_id(int school_id) {
            this.school_id = school_id;
        }

        public int getIs_auth() {
            return is_auth;
        }

        public void setIs_auth(int is_auth) {
            this.is_auth = is_auth;
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

        public String getApi_token() {
            return api_token;
        }

        public void setApi_token(String api_token) {
            this.api_token = api_token;
        }
    }
}
