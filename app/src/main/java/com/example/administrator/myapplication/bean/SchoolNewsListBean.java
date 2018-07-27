package com.example.administrator.myapplication.bean;

import java.util.List;

public class SchoolNewsListBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"totalPage":7,"currentPage":1,"data":[{"id":101,"school_id":100,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":100,"school_id":99,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":99,"school_id":98,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":98,"school_id":97,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":97,"school_id":96,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":96,"school_id":95,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":95,"school_id":94,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":94,"school_id":93,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":93,"school_id":92,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":92,"school_id":91,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":91,"school_id":90,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":90,"school_id":89,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":89,"school_id":88,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":88,"school_id":87,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":87,"school_id":86,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"}]}
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
         * data : [{"id":101,"school_id":100,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":100,"school_id":99,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":99,"school_id":98,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":98,"school_id":97,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":97,"school_id":96,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":96,"school_id":95,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":95,"school_id":94,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":94,"school_id":93,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":93,"school_id":92,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":92,"school_id":91,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":91,"school_id":90,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":90,"school_id":89,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":89,"school_id":88,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":88,"school_id":87,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"},{"id":87,"school_id":86,"title":"新闻标题","image_list":["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"],"content":"新闻标题新闻标题新闻标题","click_number":100,"status":1,"created_at":"2018-07-27 16:58:29","updated_at":"2018-07-27 16:58:29"}]
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
             * id : 101
             * school_id : 100
             * title : 新闻标题
             * image_list : ["http://192.168.1.66:86/uploads/2018-07-27/20180727161829414.jpg","http://192.168.1.66:86"]
             * content : 新闻标题新闻标题新闻标题
             * click_number : 100
             * status : 1
             * created_at : 2018-07-27 16:58:29
             * updated_at : 2018-07-27 16:58:29
             */

            private int id;
            private int school_id;
            private String title;
            private String content;
            private int click_number;
            private int status;
            private String created_at;
            private String updated_at;
            private List<String> image_list;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getSchool_id() {
                return school_id;
            }

            public void setSchool_id(int school_id) {
                this.school_id = school_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getClick_number() {
                return click_number;
            }

            public void setClick_number(int click_number) {
                this.click_number = click_number;
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

            public List<String> getImage_list() {
                return image_list;
            }

            public void setImage_list(List<String> image_list) {
                this.image_list = image_list;
            }
        }
    }
}
