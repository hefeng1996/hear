package com.he.hear.pojo;

import java.util.Date;

public class PlayRecord {
    private Integer id;

    private Integer userId;

    private Integer songId;

    private Date playtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Date getPlaytime() {
        return playtime;
    }

    public void setPlaytime(Date playtime) {
        this.playtime = playtime;
    }
}