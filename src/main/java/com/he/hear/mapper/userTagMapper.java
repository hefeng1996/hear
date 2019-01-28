package com.he.hear.mapper;

import com.he.hear.pojo.userTag;
import com.he.hear.pojo.userTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userTagMapper {
    long countByExample(userTagExample example);

    int deleteByExample(userTagExample example);

    int insert(userTag record);

    int insertSelective(userTag record);

    List<userTag> selectByExample(userTagExample example);

    int updateByExampleSelective(@Param("record") userTag record, @Param("example") userTagExample example);

    int updateByExample(@Param("record") userTag record, @Param("example") userTagExample example);

}