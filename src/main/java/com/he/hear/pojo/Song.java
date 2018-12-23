package com.he.hear.pojo;

public class Song {
    private Integer id;

    private String name;

    private Singer singer;

    private Album album;

    private String url;

    private String author;

    private String composer;

    private Integer duration;

    private String lyrics;
    private Integer isvip;
    private Integer quality;
    private String time;

    public String getTime() {
        if (this.duration!=null) {
            return this.duration / 100 + ":" + this.duration / 10 % 10 + this.duration % 10;
        }else{
            return "0:00";
        }
    }

    public Song() {
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

    public Singer getSinger() {
        return singer;
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer == null ? null : composer.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics == null ? null : lyrics.trim();
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer=" + singer +
                ", album=" + album +
                ", url='" + url + '\'' +
                ", author='" + author + '\'' +
                ", composer='" + composer + '\'' +
                ", duration=" + duration +
                ", lyrics='" + lyrics + '\'' +
                ", isvip=" + isvip +
                ", quality=" + quality +
                ", time='" + time + '\'' +
                '}';
    }
}