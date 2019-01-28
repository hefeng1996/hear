package com.he.hear.mapper;

import com.he.hear.pojo.Praise;
import com.he.hear.pojo.PraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PraiseMapper {
    long countByExample(PraiseExample example);

    int deleteByExample(PraiseExample example);

    int insert(Praise record);

    int insertSelective(Praise record);

    List<Praise> selectByExample(PraiseExample example);

    int updateByExampleSelective(@Param("record") Praise record, @Param("example") PraiseExample example);

    int updateByExample(@Param("record") Praise record, @Param("example") PraiseExample example);
}