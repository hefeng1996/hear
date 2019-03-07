package com.he.hear.mapper;

import com.he.hear.pojo.SongList;
import com.he.hear.pojo.SongListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongListMapper {
    long countByExample(SongListExample example);

    int deleteByExample(SongListExample example);

    int insert(SongList record);

    int insertSelective(SongList record);

    List<SongList> selectByExample(SongListExample example);

    int updateByExampleSelective(@Param("record") SongList record, @Param("example") SongListExample example);

    int updateByExample(@Param("record") SongList record, @Param("example") SongListExample example);
}