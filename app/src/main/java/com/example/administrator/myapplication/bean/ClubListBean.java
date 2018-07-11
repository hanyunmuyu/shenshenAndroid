package com.example.administrator.myapplication.bean;

import java.util.List;

public class ClubListBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"totalPage":7,"currentPage":1,"data":[{"id":100,"club_name":"社团-17-100-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":17,"create_user_id":100,"favorite_number":1,"member_number":1,"category_ids":"1,2,4,6","status":1,"created_at":"","updated_at":""},{"id":99,"club_name":"社团-17-99-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":17,"create_user_id":99,"favorite_number":1,"member_number":1,"category_ids":"1,3,4,5,6","status":1,"created_at":"","updated_at":""},{"id":98,"club_name":"社团-8-98-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":8,"create_user_id":98,"favorite_number":1,"member_number":1,"category_ids":"4","status":1,"created_at":"","updated_at":""},{"id":97,"club_name":"社团-8-97-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":8,"create_user_id":97,"favorite_number":1,"member_number":1,"category_ids":"1,2,5,6","status":1,"created_at":"","updated_at":""},{"id":96,"club_name":"社团-30-96-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":30,"create_user_id":96,"favorite_number":1,"member_number":1,"category_ids":"2,4","status":1,"created_at":"","updated_at":""},{"id":95,"club_name":"社团-30-95-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":30,"create_user_id":95,"favorite_number":1,"member_number":1,"category_ids":"1,3,4,5,6","status":1,"created_at":"","updated_at":""},{"id":94,"club_name":"社团-19-94-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":19,"create_user_id":94,"favorite_number":1,"member_number":1,"category_ids":"3","status":1,"created_at":"","updated_at":""},{"id":93,"club_name":"社团-19-93-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":19,"create_user_id":93,"favorite_number":1,"member_number":1,"category_ids":"1","status":1,"created_at":"","updated_at":""},{"id":92,"club_name":"社团-28-92-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":28,"create_user_id":92,"favorite_number":1,"member_number":1,"category_ids":"1,2,4,5","status":1,"created_at":"","updated_at":""},{"id":91,"club_name":"社团-28-91-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":28,"create_user_id":91,"favorite_number":1,"member_number":1,"category_ids":"1,2,3,4,5","status":1,"created_at":"","updated_at":""},{"id":90,"club_name":"社团-43-90-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":43,"create_user_id":90,"favorite_number":1,"member_number":1,"category_ids":"2,6","status":1,"created_at":"","updated_at":""},{"id":89,"club_name":"社团-43-89-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":43,"create_user_id":89,"favorite_number":1,"member_number":1,"category_ids":"1,5","status":1,"created_at":"","updated_at":""},{"id":88,"club_name":"社团-20-88-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":20,"create_user_id":88,"favorite_number":1,"member_number":1,"category_ids":"1,5","status":1,"created_at":"","updated_at":""},{"id":87,"club_name":"社团-20-87-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":20,"create_user_id":87,"favorite_number":1,"member_number":1,"category_ids":"1,2,3,4,5,6","status":1,"created_at":"","updated_at":""},{"id":86,"club_name":"社团-44-86-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":44,"create_user_id":86,"favorite_number":1,"member_number":1,"category_ids":"1,4,5","status":1,"created_at":"","updated_at":""},{"id":85,"club_name":"社团-44-85-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":44,"create_user_id":85,"favorite_number":1,"member_number":1,"category_ids":"3,4","status":1,"created_at":"","updated_at":""}]}
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
         * totalPage : 7
         * currentPage : 1
         * data : [{"id":100,"club_name":"社团-17-100-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":17,"create_user_id":100,"favorite_number":1,"member_number":1,"category_ids":"1,2,4,6","status":1,"created_at":"","updated_at":""},{"id":99,"club_name":"社团-17-99-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":17,"create_user_id":99,"favorite_number":1,"member_number":1,"category_ids":"1,3,4,5,6","status":1,"created_at":"","updated_at":""},{"id":98,"club_name":"社团-8-98-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":8,"create_user_id":98,"favorite_number":1,"member_number":1,"category_ids":"4","status":1,"created_at":"","updated_at":""},{"id":97,"club_name":"社团-8-97-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":8,"create_user_id":97,"favorite_number":1,"member_number":1,"category_ids":"1,2,5,6","status":1,"created_at":"","updated_at":""},{"id":96,"club_name":"社团-30-96-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":30,"create_user_id":96,"favorite_number":1,"member_number":1,"category_ids":"2,4","status":1,"created_at":"","updated_at":""},{"id":95,"club_name":"社团-30-95-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":30,"create_user_id":95,"favorite_number":1,"member_number":1,"category_ids":"1,3,4,5,6","status":1,"created_at":"","updated_at":""},{"id":94,"club_name":"社团-19-94-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":19,"create_user_id":94,"favorite_number":1,"member_number":1,"category_ids":"3","status":1,"created_at":"","updated_at":""},{"id":93,"club_name":"社团-19-93-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":19,"create_user_id":93,"favorite_number":1,"member_number":1,"category_ids":"1","status":1,"created_at":"","updated_at":""},{"id":92,"club_name":"社团-28-92-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":28,"create_user_id":92,"favorite_number":1,"member_number":1,"category_ids":"1,2,4,5","status":1,"created_at":"","updated_at":""},{"id":91,"club_name":"社团-28-91-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":28,"create_user_id":91,"favorite_number":1,"member_number":1,"category_ids":"1,2,3,4,5","status":1,"created_at":"","updated_at":""},{"id":90,"club_name":"社团-43-90-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":43,"create_user_id":90,"favorite_number":1,"member_number":1,"category_ids":"2,6","status":1,"created_at":"","updated_at":""},{"id":89,"club_name":"社团-43-89-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":43,"create_user_id":89,"favorite_number":1,"member_number":1,"category_ids":"1,5","status":1,"created_at":"","updated_at":""},{"id":88,"club_name":"社团-20-88-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":20,"create_user_id":88,"favorite_number":1,"member_number":1,"category_ids":"1,5","status":1,"created_at":"","updated_at":""},{"id":87,"club_name":"社团-20-87-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":20,"create_user_id":87,"favorite_number":1,"member_number":1,"category_ids":"1,2,3,4,5,6","status":1,"created_at":"","updated_at":""},{"id":86,"club_name":"社团-44-86-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":44,"create_user_id":86,"favorite_number":1,"member_number":1,"category_ids":"1,4,5","status":1,"created_at":"","updated_at":""},{"id":85,"club_name":"社团-44-85-1531289488","club_logo":"http://192.168.1.66:86","club_description":"","school_id":44,"create_user_id":85,"favorite_number":1,"member_number":1,"category_ids":"3,4","status":1,"created_at":"","updated_at":""}]
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
             * id : 100
             * club_name : 社团-17-100-1531289488
             * club_logo : http://192.168.1.66:86
             * club_description :
             * school_id : 17
             * create_user_id : 100
             * favorite_number : 1
             * member_number : 1
             * category_ids : 1,2,4,6
             * status : 1
             * created_at :
             * updated_at :
             */

            private int id;
            private String club_name;
            private String club_logo;
            private String club_description;
            private int school_id;
            private int create_user_id;
            private int favorite_number;
            private int member_number;
            private String category_ids;
            private int status;
            private String created_at;
            private String updated_at;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getClub_name() {
                return club_name;
            }

            public void setClub_name(String club_name) {
                this.club_name = club_name;
            }

            public String getClub_logo() {
                return club_logo;
            }

            public void setClub_logo(String club_logo) {
                this.club_logo = club_logo;
            }

            public String getClub_description() {
                return club_description;
            }

            public void setClub_description(String club_description) {
                this.club_description = club_description;
            }

            public int getSchool_id() {
                return school_id;
            }

            public void setSchool_id(int school_id) {
                this.school_id = school_id;
            }

            public int getCreate_user_id() {
                return create_user_id;
            }

            public void setCreate_user_id(int create_user_id) {
                this.create_user_id = create_user_id;
            }

            public int getFavorite_number() {
                return favorite_number;
            }

            public void setFavorite_number(int favorite_number) {
                this.favorite_number = favorite_number;
            }

            public int getMember_number() {
                return member_number;
            }

            public void setMember_number(int member_number) {
                this.member_number = member_number;
            }

            public String getCategory_ids() {
                return category_ids;
            }

            public void setCategory_ids(String category_ids) {
                this.category_ids = category_ids;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
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
