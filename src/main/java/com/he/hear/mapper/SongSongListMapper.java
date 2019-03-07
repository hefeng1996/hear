package com.he.hear.mapper;

import com.he.hear.pojo.SongSongList;
import com.he.hear.pojo.SongSongListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongSongListMapper {
    long countByExample(SongSongListExample example);

    int deleteByExample(SongSongListExample example);

    int insert(SongSongList record);

    int insertSelective(SongSongList record);

    List<SongSongList> selectByExample(SongSongListExample example);

    int updateByExampleSelective(@Param("record") SongSongList record, @Param("example") SongSongListExample example);

    int updateByExample(@Param("record") SongSongList record, @Param("example") SongSongListExample example);
}