package com.he.hear.mapper;

import com.he.hear.pojo.Warning;

public interface WarningMapper {
    int insert(Warning record);

    int insertSelective(Warning record);
}