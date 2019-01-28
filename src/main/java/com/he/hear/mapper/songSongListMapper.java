package com.he.hear.mapper;

import com.he.hear.pojo.songSongList;
import com.he.hear.pojo.songSongListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface songSongListMapper {
    long countByExample(songSongListExample example);

    int deleteByExample(songSongListExample example);

    int insert(songSongList record);

    int insertSelective(songSongList record);

    List<songSongList> selectByExample(songSongListExample example);

    int updateByExampleSelective(@Param("record") songSongList record, @Param("example") songSongListExample example);

    int updateByExample(@Param("record") songSongList record, @Param("example") songSongListExample example);
}