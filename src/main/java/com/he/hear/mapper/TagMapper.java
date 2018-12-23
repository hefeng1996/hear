package com.he.hear.mapper;


import com.he.hear.pojo.Tag;

import java.util.List;


public interface TagMapper {
    List<Tag> selectSonglistTagById(int id);//根据ID查询歌单标签信息
    List<Tag> selectAllTag();
}
