package com.he.hear.mapper;

import com.he.hear.pojo.userSinger;
import com.he.hear.pojo.userSingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userSingerMapper {
    long countByExample(userSingerExample example);

    int deleteByExample(userSingerExample example);

    int insert(userSinger record);

    int insertSelective(userSinger record);

    List<userSinger> selectByExample(userSingerExample example);

    int updateByExampleSelective(@Param("record") userSinger record, @Param("example") userSingerExample example);

    int updateByExample(@Param("record") userSinger record, @Param("example") userSingerExample example);
}