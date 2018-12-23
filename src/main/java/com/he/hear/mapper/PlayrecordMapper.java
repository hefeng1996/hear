package com.he.hear.mapper;


import com.he.hear.pojo.Playrecord;

import java.util.List;

public interface PlayrecordMapper {
    List<Playrecord> selectPlayreCord5(int id);
    List<Playrecord> selectPlayreCord20(int id);
    List<Playrecord> selectPlayreCordAll(int id);

    int selectPlayreCordCount(int id);
}
