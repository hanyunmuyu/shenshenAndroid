package com.example.administrator.myapplication.bean;

import java.util.List;

public class SchoolListBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"data":[{"id":50,"school_name":"河南工业大学-49","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":149,"club_number":50,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":49,"school_name":"河南工业大学-48","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学","favorite_number":148,"club_number":49,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":48,"school_name":"河南工业大学-47","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学","favorite_number":147,"club_number":48,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":47,"school_name":"河南工业大学-46","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学","favorite_number":146,"club_number":47,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":46,"school_name":"河南工业大学-45","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"","favorite_number":145,"club_number":46,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":45,"school_name":"河南工业大学-44","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":144,"club_number":45,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":44,"school_name":"河南工业大学-43","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":143,"club_number":44,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":43,"school_name":"河南工业大学-42","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":142,"club_number":43,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":42,"school_name":"河南工业大学-41","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":141,"club_number":42,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":41,"school_name":"河南工业大学-40","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":140,"club_number":41,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":40,"school_name":"河南工业大学-39","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学","favorite_number":139,"club_number":40,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":39,"school_name":"河南工业大学-38","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学","favorite_number":138,"club_number":39,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":38,"school_name":"河南工业大学-37","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学","favorite_number":137,"club_number":38,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":37,"school_name":"河南工业大学-36","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"","favorite_number":136,"club_number":37,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":36,"school_name":"河南工业大学-35","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":135,"club_number":36,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":35,"school_name":"河南工业大学-34","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":134,"club_number":35,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"}],"totalPage":4,"currentPage":1}
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
         * data : [{"id":50,"school_name":"河南工业大学-49","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":149,"club_number":50,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":49,"school_name":"河南工业大学-48","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学","favorite_number":148,"club_number":49,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":48,"school_name":"河南工业大学-47","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学","favorite_number":147,"club_number":48,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":47,"school_name":"河南工业大学-46","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学","favorite_number":146,"club_number":47,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":46,"school_name":"河南工业大学-45","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"","favorite_number":145,"club_number":46,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":45,"school_name":"河南工业大学-44","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":144,"club_number":45,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":44,"school_name":"河南工业大学-43","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":143,"club_number":44,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":43,"school_name":"河南工业大学-42","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":142,"club_number":43,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":42,"school_name":"河南工业大学-41","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":141,"club_number":42,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":41,"school_name":"河南工业大学-40","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":140,"club_number":41,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":40,"school_name":"河南工业大学-39","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学","favorite_number":139,"club_number":40,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":39,"school_name":"河南工业大学-38","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学","favorite_number":138,"club_number":39,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":38,"school_name":"河南工业大学-37","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学","favorite_number":137,"club_number":38,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":37,"school_name":"河南工业大学-36","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"","favorite_number":136,"club_number":37,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":36,"school_name":"河南工业大学-35","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":135,"club_number":36,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"},{"id":35,"school_name":"河南工业大学-34","school_logo":"http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg","school_description":"河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学河南工业大学","favorite_number":134,"club_number":35,"created_at":"2018-07-11 06:11:21","updated_at":"2018-07-11 06:11:21"}]
         * totalPage : 4
         * currentPage : 1
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
             * id : 50
             * school_name : 河南工业大学-49
             * school_logo : http://192.168.1.66:86/uploads/logo/94a400fd0f898bc2d85f8443134e2c1a5.jpg
             * school_description : 河南工业大学河南工业大学河南工业大学河南工业大学
             * favorite_number : 149
             * club_number : 50
             * created_at : 2018-07-11 06:11:21
             * updated_at : 2018-07-11 06:11:21
             */

            private int id;
            private String school_name;
            private String school_logo;
            private String school_description;
            private int favorite_number;
            private int club_number;
            private String created_at;
            private String updated_at;

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
        }
    }
}