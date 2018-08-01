package com.example.administrator.myapplication.bean;

import java.util.List;

public class MessageBean {

    /**
     * code : 200
     * status : success
     * msg : 成功！
     * data : {"totalPage":7,"currentPage":1,"data":[{"id":99,"user_id":1,"title":"消息的标题","source":"club","source_id":99,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-36-99-1533022850"},{"id":98,"user_id":1,"title":"消息的标题","source":"school","source_id":98,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":97,"user_id":1,"title":"消息的标题","source":"club","source_id":97,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-6-97-1533022850"},{"id":96,"user_id":1,"title":"消息的标题","source":"school","source_id":96,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":95,"user_id":1,"title":"消息的标题","source":"club","source_id":95,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-30-95-1533022850"},{"id":94,"user_id":1,"title":"消息的标题","source":"school","source_id":94,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":93,"user_id":1,"title":"消息的标题","source":"club","source_id":93,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-27-93-1533022850"},{"id":92,"user_id":1,"title":"消息的标题","source":"school","source_id":92,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":91,"user_id":1,"title":"消息的标题","source":"club","source_id":91,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-25-91-1533022850"},{"id":90,"user_id":1,"title":"消息的标题","source":"school","source_id":90,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":89,"user_id":1,"title":"消息的标题","source":"club","source_id":89,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-44-89-1533022850"},{"id":88,"user_id":1,"title":"消息的标题","source":"school","source_id":88,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":87,"user_id":1,"title":"消息的标题","source":"club","source_id":87,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-24-87-1533022850"},{"id":86,"user_id":1,"title":"消息的标题","source":"school","source_id":86,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":85,"user_id":1,"title":"消息的标题","source":"club","source_id":85,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-2-85-1533022850"},{"id":84,"user_id":1,"title":"消息的标题","source":"school","source_id":84,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""}]}
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
         * data : [{"id":99,"user_id":1,"title":"消息的标题","source":"club","source_id":99,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-36-99-1533022850"},{"id":98,"user_id":1,"title":"消息的标题","source":"school","source_id":98,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":97,"user_id":1,"title":"消息的标题","source":"club","source_id":97,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-6-97-1533022850"},{"id":96,"user_id":1,"title":"消息的标题","source":"school","source_id":96,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":95,"user_id":1,"title":"消息的标题","source":"club","source_id":95,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-30-95-1533022850"},{"id":94,"user_id":1,"title":"消息的标题","source":"school","source_id":94,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":93,"user_id":1,"title":"消息的标题","source":"club","source_id":93,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-27-93-1533022850"},{"id":92,"user_id":1,"title":"消息的标题","source":"school","source_id":92,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":91,"user_id":1,"title":"消息的标题","source":"club","source_id":91,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-25-91-1533022850"},{"id":90,"user_id":1,"title":"消息的标题","source":"school","source_id":90,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":89,"user_id":1,"title":"消息的标题","source":"club","source_id":89,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-44-89-1533022850"},{"id":88,"user_id":1,"title":"消息的标题","source":"school","source_id":88,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":87,"user_id":1,"title":"消息的标题","source":"club","source_id":87,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-24-87-1533022850"},{"id":86,"user_id":1,"title":"消息的标题","source":"school","source_id":86,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""},{"id":85,"user_id":1,"title":"消息的标题","source":"club","source_id":85,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"http://192.168.1.66:86","name":"社团-2-85-1533022850"},{"id":84,"user_id":1,"title":"消息的标题","source":"school","source_id":84,"status":0,"created_at":"2018-07-31 15:40:51","updated_at":"2018-07-31 15:40:51","logo":"","name":""}]
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
             * id : 99
             * user_id : 1
             * title : 消息的标题
             * source : club
             * source_id : 99
             * status : 0
             * created_at : 2018-07-31 15:40:51
             * updated_at : 2018-07-31 15:40:51
             * logo : http://192.168.1.66:86
             * name : 社团-36-99-1533022850
             */

            private int id;
            private int user_id;
            private String title;
            private String source;
            private int source_id;
            private int status;
            private String created_at;
            private String updated_at;
            private String logo;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
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

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
