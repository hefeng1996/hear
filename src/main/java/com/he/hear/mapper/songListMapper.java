package com.he.hear.mapper;

import com.he.hear.pojo.songList;
import com.he.hear.pojo.songListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface songListMapper {
    long countByExample(songListExample example);

    int deleteByExample(songListExample example);

    int insert(songList record);

    int insertSelective(songList record);

    List<songList> selectByExample(songListExample example);

    int updateByExampleSelective(@Param("record") songList record, @Param("example") songListExample example);

    int updateByExample(@Param("record") songList record, @Param("example") songListExample example);
}