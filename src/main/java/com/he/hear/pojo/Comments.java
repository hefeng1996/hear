package com.he.hear.pojo;

import java.util.Date;

public class Comments {
    private Integer id;

    private Integer upperid;

    private String content;

    private Integer userId;

    private Date time;

    private Integer songId;

    private Integer albumId;

    private Integer momentId;

    private Integer songlistId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpperid() {
        return upperid;
    }

    public void setUpperid(Integer upperid) {
        this.upperid = upperid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getMomentId() {
        return momentId;
    }

    public void setMomentId(Integer momentId) {
        this.momentId = momentId;
    }

    public Integer getSonglistId() {
        return songlistId;
    }

    public void setSonglistId(Integer songlistId) {
        this.songlistId = songlistId;
    }
}