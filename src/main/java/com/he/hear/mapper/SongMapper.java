package com.he.hear.mapper;


import com.he.hear.pojo.Song;

import java.util.List;


public interface SongMapper {
    public List<Song> selectSongBySingerId(int id);
    public List<Song> newSong();//新歌榜
    public List<Song> hotSong();//热歌榜
    public List<Song> mySong();//原创榜
    public Song selectSongById(int id);//Z
    public Song selectSongByIds(int id);//H 查询歌单详情
    public List<Song> selectSongBySonglistId(int id);//查询歌单里所有歌曲
    public List<Song> selectSongByAlbumId(int id);//查询专辑里所有歌曲
}
