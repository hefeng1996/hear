package com.he.hear.pojo;

public class Warning {
    private Integer id;

    private String warn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarn() {
        return warn;
    }

    public void setWarn(String warn) {
        this.warn = warn == null ? null : warn.trim();
    }
}