package com.he.hear.mapper;

import com.he.hear.pojo.Moment;
import com.he.hear.pojo.MomentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentMapper {
    long countByExample(MomentExample example);

    int deleteByExample(MomentExample example);

    int insert(Moment record);

    int insertSelective(Moment record);

    List<Moment> selectByExample(MomentExample example);

    int updateByExampleSelective(@Param("record") Moment record, @Param("example") MomentExample example);

    int updateByExample(@Param("record") Moment record, @Param("example") MomentExample example);
}