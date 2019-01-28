package com.he.hear.mapper;

import com.he.hear.pojo.songListTag;
import com.he.hear.pojo.songListTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface songListTagMapper {
    long countByExample(songListTagExample example);

    int deleteByExample(songListTagExample example);

    int insert(songListTag record);

    int insertSelective(songListTag record);

    List<songListTag> selectByExample(songListTagExample example);

    int updateByExampleSelective(@Param("record") songListTag record, @Param("example") songListTagExample example);

    int updateByExample(@Param("record") songListTag record, @Param("example") songListTagExample example);
}