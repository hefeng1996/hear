package com.he.hear.mapper;


import com.he.hear.pojo.MySinger;

import java.util.List;

public interface MySingerMapper {
    List<MySinger> selectMySingerByUserId(int id);
//    收藏歌手
    boolean collectSinger(MySinger mySinger);
//    取消收藏歌手
    boolean cancelCollectSinger(MySinger mySinger);
}
