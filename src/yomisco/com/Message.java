package yomisco.com;

/**
 * Created by kogbe on 17/05/2018.
 */


    public class Message {
        private String msg;

        private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Message(String str){
            this.msg=str;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String str) {
            this.msg=str;
        }

    }

