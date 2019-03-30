package com.example.manager.beans;

public class ResObject {

    private String status;
    private String desc;
    private Object data;

    public ResObject(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public ResObject(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
