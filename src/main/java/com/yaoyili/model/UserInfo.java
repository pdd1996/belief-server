package com.yaoyili.model;

import java.sql.Date;

public class UserInfo {

    private Integer uid;

    private String name;

    private Date bothday;

    private String sex;

    private String city;

    private String photoUrl;

    public UserInfo() {
    }

    public UserInfo(Integer uid, String name, Date bothday, String city, String sex, String photoUrl) {
        this.uid = uid;
        this.name = name;
        this.bothday = bothday;
        this.city = city;
        this.photoUrl = photoUrl;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBothday() {
        return bothday;
    }

    public void setBothday(Date bothday) {
        this.bothday = bothday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}