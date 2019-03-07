package com.he.hear.mapper;

import com.he.hear.pojo.UserTag;
import com.he.hear.pojo.UserTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTagMapper {
    long countByExample(UserTagExample example);

    int deleteByExample(UserTagExample example);

    int insert(UserTag record);

    int insertSelective(UserTag record);

    List<UserTag> selectByExample(UserTagExample example);

    int updateByExampleSelective(@Param("record") UserTag record, @Param("example") UserTagExample example);

    int updateByExample(@Param("record") UserTag record, @Param("example") UserTagExample example);
}