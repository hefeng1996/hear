package com.he.hear.mapper;

import com.he.hear.pojo.Singer;
import com.he.hear.pojo.SingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingerMapper {
    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int insert(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExampleWithBLOBs(SingerExample example);

    List<Singer> selectByExample(SingerExample example);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExampleWithBLOBs(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);
}