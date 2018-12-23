package com.he.hear.mapper;


import com.he.hear.pojo.UserTag;

import java.util.List;

public interface UserTagMapper {
    boolean insertUserTag(int tagId, int userId);

    boolean removeUserTag(int userId);

    List<UserTag> selectTagByUserId(int userId);
}
