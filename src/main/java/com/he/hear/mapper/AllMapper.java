package com.he.hear.mapper;


import com.he.hear.pojo.*;

import java.util.List;


public interface AllMapper {
    List<Song> getSongsByName(String songname);
    List<Songlist> getSonglistsByName(String songlistname);
    List<Album> getAlbumsByName(String albumname);
    List<Singer> getSingersByName(String ingername);
    List<User> getUsersByName(String username);

//查询用户创建的歌单数量
    int getSonglistNumByUserId(int userId);
//    查询用户的粉丝数
    int getfansByUserId(int userId);

    int getSongNumBySonglistId(int songlistId);
    int getCollectionNumBySonglistId(int songlistId);
}
