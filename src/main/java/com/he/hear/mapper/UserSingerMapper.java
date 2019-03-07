package com.he.hear.mapper;

import com.he.hear.pojo.UserSinger;
import com.he.hear.pojo.UserSingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSingerMapper {
    long countByExample(UserSingerExample example);

    int deleteByExample(UserSingerExample example);

    int insert(UserSinger record);

    int insertSelective(UserSinger record);

    List<UserSinger> selectByExample(UserSingerExample example);

    int updateByExampleSelective(@Param("record") UserSinger record, @Param("example") UserSingerExample example);

    int updateByExample(@Param("record") UserSinger record, @Param("example") UserSingerExample example);
}