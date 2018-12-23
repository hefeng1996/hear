package com.he.hear.pojo;

import java.util.Date;
import java.util.List;
//专辑
public class Album {
    private Integer id;//专辑ID

    private String name;//专辑名

    private String company;//公司

    private Date date;//专辑发布时间

    private String img;//专辑头像(图片)

    private List<Song> song;//歌曲列表

    private Singer singer;//歌手

    public Album() {
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Song> getSong() {
        return song;
    }

    public void setSong(List<Song> song) {
        this.song = song;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", date=" + date +
                ", img='" + img + '\'' +
                ", song=" + song +
                ", singer=" + singer +
                '}';
    }
}