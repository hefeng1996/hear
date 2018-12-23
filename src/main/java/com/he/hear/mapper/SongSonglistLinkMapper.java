package com.he.hear.mapper;


import com.he.hear.pojo.SongSonglistLink;

import java.util.List;


interface SongSonglistLinkMapper {
    boolean insertSong(SongSonglistLink songSonglistLink);
    List<SongSonglistLink> selectSonglistAndSongByListId(int id);//G

    boolean removeSonglistSongBySonglistId(int songlistId);//G

    boolean removesongBySongIdAndSonglistId(int songlistId, int songId);//G
}
