package com.example.administrator.myapplication.bean;

import java.util.List;

public class ClubDetailBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"detail":{"id":101,"club_name":"hanyun","club_logo":"http://192.168.1.66:86/uploads/2018-08-08/20180808104707608.jpg","club_description":"hahah","school_id":6,"create_user_id":1,"favorite_number":1,"member_number":1,"category_ids":"1,2,3,4,5,6","status":1,"created_at":"2018-08-08 10:47:07","updated_at":"2018-08-08 10:47:07","isAttented":0,"categories":[{"id":1,"category_name":"体育","created_at":"","updated_at":""},{"id":2,"category_name":"绘画","created_at":"","updated_at":""},{"id":3,"category_name":"设计","created_at":"","updated_at":""},{"id":4,"category_name":"编程","created_at":"","updated_at":""},{"id":5,"category_name":"足球","created_at":"","updated_at":""},{"id":6,"category_name":"篮球","created_at":"","updated_at":""}]}}
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
         * detail : {"id":101,"club_name":"hanyun","club_logo":"http://192.168.1.66:86/uploads/2018-08-08/20180808104707608.jpg","club_description":"hahah","school_id":6,"create_user_id":1,"favorite_number":1,"member_number":1,"category_ids":"1,2,3,4,5,6","status":1,"created_at":"2018-08-08 10:47:07","updated_at":"2018-08-08 10:47:07","isAttented":0,"categories":[{"id":1,"category_name":"体育","created_at":"","updated_at":""},{"id":2,"category_name":"绘画","created_at":"","updated_at":""},{"id":3,"category_name":"设计","created_at":"","updated_at":""},{"id":4,"category_name":"编程","created_at":"","updated_at":""},{"id":5,"category_name":"足球","created_at":"","updated_at":""},{"id":6,"category_name":"篮球","created_at":"","updated_at":""}]}
         */

        private DetailBean detail;

        public DetailBean getDetail() {
            return detail;
        }

        public void setDetail(DetailBean detail) {
            this.detail = detail;
        }

        public static class DetailBean {
            /**
             * id : 101
             * club_name : hanyun
             * club_logo : http://192.168.1.66:86/uploads/2018-08-08/20180808104707608.jpg
             * club_description : hahah
             * school_id : 6
             * create_user_id : 1
             * favorite_number : 1
             * member_number : 1
             * category_ids : 1,2,3,4,5,6
             * status : 1
             * created_at : 2018-08-08 10:47:07
             * updated_at : 2018-08-08 10:47:07
             * isAttented : 0
             * categories : [{"id":1,"category_name":"体育","created_at":"","updated_at":""},{"id":2,"category_name":"绘画","created_at":"","updated_at":""},{"id":3,"category_name":"设计","created_at":"","updated_at":""},{"id":4,"category_name":"编程","created_at":"","updated_at":""},{"id":5,"category_name":"足球","created_at":"","updated_at":""},{"id":6,"category_name":"篮球","created_at":"","updated_at":""}]
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
            private int isAttented;
            private List<CategoriesBean> categories;

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

            public int getIsAttented() {
                return isAttented;
            }

            public void setIsAttented(int isAttented) {
                this.isAttented = isAttented;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public static class CategoriesBean {
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
    }
}
