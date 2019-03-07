package com.he.hear.mapper;

import com.he.hear.pojo.UserSongList;
import com.he.hear.pojo.UserSongListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSongListMapper {
    long countByExample(UserSongListExample example);

    int deleteByExample(UserSongListExample example);

    int insert(UserSongList record);

    int insertSelective(UserSongList record);

    List<UserSongList> selectByExample(UserSongListExample example);

    int updateByExampleSelective(@Param("record") UserSongList record, @Param("example") UserSongListExample example);

    int updateByExample(@Param("record") UserSongList record, @Param("example") UserSongListExample example);
}