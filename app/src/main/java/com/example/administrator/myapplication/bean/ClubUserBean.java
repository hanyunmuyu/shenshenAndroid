package com.example.administrator.myapplication.bean;

import java.util.List;

public class ClubUserBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"totalPage":1,"currentPage":1,"data":[{"id":1,"club_id":1,"user_id":1,"group_id":0,"status":1,"level":0,"created_at":"","updated_at":"2018-08-13 10:37:40","name":"hanyun","nick_name":"","avatar":"http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","password":"$2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi","gender":3,"school_id":6,"is_auth":0,"api_token":"$2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC","remember_token":""},{"id":1,"club_id":101,"user_id":1,"group_id":0,"status":1,"level":0,"created_at":"","updated_at":"2018-08-13 10:37:40","name":"hanyun","nick_name":"","avatar":"http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","password":"$2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi","gender":3,"school_id":6,"is_auth":0,"api_token":"$2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC","remember_token":""},{"id":1,"club_id":99,"user_id":1,"group_id":0,"status":1,"level":0,"created_at":"","updated_at":"2018-08-13 10:37:40","name":"hanyun","nick_name":"","avatar":"http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","password":"$2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi","gender":3,"school_id":6,"is_auth":0,"api_token":"$2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC","remember_token":""}]}
     */

    private int code;
    private String status;
    private String msg;
    private DataBeanX data;

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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * totalPage : 1
         * currentPage : 1
         * data : [{"id":1,"club_id":1,"user_id":1,"group_id":0,"status":1,"level":0,"created_at":"","updated_at":"2018-08-13 10:37:40","name":"hanyun","nick_name":"","avatar":"http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","password":"$2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi","gender":3,"school_id":6,"is_auth":0,"api_token":"$2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC","remember_token":""},{"id":1,"club_id":101,"user_id":1,"group_id":0,"status":1,"level":0,"created_at":"","updated_at":"2018-08-13 10:37:40","name":"hanyun","nick_name":"","avatar":"http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","password":"$2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi","gender":3,"school_id":6,"is_auth":0,"api_token":"$2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC","remember_token":""},{"id":1,"club_id":99,"user_id":1,"group_id":0,"status":1,"level":0,"created_at":"","updated_at":"2018-08-13 10:37:40","name":"hanyun","nick_name":"","avatar":"http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg","true_name":"","id_card_number":"","id_card_a":"","id_card_b":"","student_card_a":"","student_card_b":"","student_number":"","phone":"","password":"$2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi","gender":3,"school_id":6,"is_auth":0,"api_token":"$2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC","remember_token":""}]
         */

        private int totalPage;
        private int currentPage;
        private List<DataBean> data;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
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
             * club_id : 1
             * user_id : 1
             * group_id : 0
             * status : 1
             * level : 0
             * created_at :
             * updated_at : 2018-08-13 10:37:40
             * name : hanyun
             * nick_name :
             * avatar : http://192.168.1.66:86/uploads/2018-08-08/20180808104900696.jpg
             * true_name :
             * id_card_number :
             * id_card_a :
             * id_card_b :
             * student_card_a :
             * student_card_b :
             * student_number :
             * phone :
             * password : $2y$10$zJYCro5orMo3IEMwTefUS.armUHorv1Vv4jGF3HeYMf/MJzgsC9Mi
             * gender : 3
             * school_id : 6
             * is_auth : 0
             * api_token : $2y$10$4xb1YJwAI4qNlz3L3SWNbO0RxrMV90Rp848CrkeF3pMGyB8n6v9tC
             * remember_token :
             */

            private int id;
            private int club_id;
            private int user_id;
            private int group_id;
            private int status;
            private int level;
            private String created_at;
            private String updated_at;
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
            private String password;
            private int gender;
            private int school_id;
            private int is_auth;
            private String api_token;
            private String remember_token;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getClub_id() {
                return club_id;
            }

            public void setClub_id(int club_id) {
                this.club_id = club_id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getGroup_id() {
                return group_id;
            }

            public void setGroup_id(int group_id) {
                this.group_id = group_id;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
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

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
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

            public String getApi_token() {
                return api_token;
            }

            public void setApi_token(String api_token) {
                this.api_token = api_token;
            }

            public String getRemember_token() {
                return remember_token;
            }

            public void setRemember_token(String remember_token) {
                this.remember_token = remember_token;
            }
        }
    }
}
