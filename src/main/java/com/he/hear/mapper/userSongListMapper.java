package com.he.hear.mapper;

import com.he.hear.pojo.userSongList;
import com.he.hear.pojo.userSongListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userSongListMapper {
    long countByExample(userSongListExample example);

    int deleteByExample(userSongListExample example);

    int insert(userSongList record);

    int insertSelective(userSongList record);

    List<userSongList> selectByExample(userSongListExample example);

    int updateByExampleSelective(@Param("record") userSongList record, @Param("example") userSongListExample example);

    int updateByExample(@Param("record") userSongList record, @Param("example") userSongListExample example);
}