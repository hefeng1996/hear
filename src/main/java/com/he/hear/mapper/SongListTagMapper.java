package com.he.hear.mapper;

import com.he.hear.pojo.SongListTag;
import com.he.hear.pojo.SongListTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SongListTagMapper {
    long countByExample(SongListTagExample example);

    int deleteByExample(SongListTagExample example);

    int insert(SongListTag record);

    int insertSelective(SongListTag record);

    List<SongListTag> selectByExample(SongListTagExample example);

    int updateByExampleSelective(@Param("record") SongListTag record, @Param("example") SongListTagExample example);

    int updateByExample(@Param("record") SongListTag record, @Param("example") SongListTagExample example);
}