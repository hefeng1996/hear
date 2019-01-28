package com.he.hear.mapper;

import com.he.hear.pojo.PlayRecord;
import com.he.hear.pojo.PlayRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayRecordMapper {
    long countByExample(PlayRecordExample example);

    int deleteByExample(PlayRecordExample example);

    int insert(PlayRecord record);

    int insertSelective(PlayRecord record);

    List<PlayRecord> selectByExample(PlayRecordExample example);

    int updateByExampleSelective(@Param("record") PlayRecord record, @Param("example") PlayRecordExample example);

    int updateByExample(@Param("record") PlayRecord record, @Param("example") PlayRecordExample example);
}