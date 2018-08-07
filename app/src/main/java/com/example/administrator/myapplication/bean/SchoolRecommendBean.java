package com.example.administrator.myapplication.bean;

import java.util.List;

public class SchoolRecommendBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"totalPage":7,"currentPage":1,"data":[{"id":100,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"club","source_id":100,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-26-100-1533612117","logo":""},{"id":99,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":99,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":98,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":98,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-19-98-1533612117","logo":""},{"id":97,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"school","source_id":97,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":96,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":96,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-11-96-1533612117","logo":""},{"id":95,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":95,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":94,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"club","source_id":94,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-43-94-1533612117","logo":""},{"id":93,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":93,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":92,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":92,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-20-92-1533612117","logo":""},{"id":91,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"school","source_id":91,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":90,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":90,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-1-90-1533612117","logo":""},{"id":89,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":89,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":88,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"club","source_id":88,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-14-88-1533612117","logo":""},{"id":87,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":87,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":86,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":86,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-34-86-1533612117","logo":""},{"id":85,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"school","source_id":85,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""}]}
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
         * data : [{"id":100,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"club","source_id":100,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-26-100-1533612117","logo":""},{"id":99,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":99,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":98,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":98,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-19-98-1533612117","logo":""},{"id":97,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"school","source_id":97,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":96,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":96,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-11-96-1533612117","logo":""},{"id":95,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":95,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":94,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"club","source_id":94,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-43-94-1533612117","logo":""},{"id":93,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":93,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":92,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":92,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-20-92-1533612117","logo":""},{"id":91,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"school","source_id":91,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":90,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":90,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-1-90-1533612117","logo":""},{"id":89,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":89,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":88,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"club","source_id":88,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-14-88-1533612117","logo":""},{"id":87,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"school","source_id":87,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""},{"id":86,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86"],"source":"club","source_id":86,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"社团-34-86-1533612117","logo":""},{"id":85,"title":"我是标题","description":"我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子","image_list":["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"],"source":"school","source_id":85,"status":1,"created_at":"2018-08-07 11:21:58","updated_at":"2018-08-07 11:21:58","name":"","logo":""}]
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
             * title : 我是标题
             * description : 我是描述的蚊子，我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子我是描述的蚊子
             * image_list : ["http://192.168.1.66:86","http://192.168.1.66:86","http://192.168.1.66:86"]
             * source : club
             * source_id : 100
             * status : 1
             * created_at : 2018-08-07 11:21:58
             * updated_at : 2018-08-07 11:21:58
             * name : 社团-26-100-1533612117
             * logo :
             */

            private int id;
            private String title;
            private String description;
            private String source;
            private int source_id;
            private int status;
            private String created_at;
            private String updated_at;
            private String name;
            private String logo;
            private List<String> image_list;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public int getSource_id() {
                return source_id;
            }

            public void setSource_id(int source_id) {
                this.source_id = source_id;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
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
