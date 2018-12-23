package com.he.hear.mapper;



import com.he.hear.pojo.MySonglist;

import java.util.List;

public interface MySonglistMapper {
    List<MySonglist> selectMySonglistByUserId(int id);//查看用户收藏的歌单
    boolean saveSonglist(MySonglist mySonglist);//收藏歌单
    boolean cancelSaveSonglist(MySonglist mySonglist);//取消收藏
    boolean removeSaveSonglist(int songListId);//删除收藏

}
