package com.he.hear.mapper;


import com.he.hear.pojo.Comments;

import java.util.List;

public interface AlbumCommentMapper {
//        根据歌曲id查所有评论
    List<Comments> selectCommentsByAlbumId(int albumid);
//    根据评论查上一级评论
    Comments selectUpperCommentByComentId(int cid);
//    根据评论id删除评论
    boolean deleteCommentByCommnetId(int cid);

    //为歌曲添加评论
    boolean insertAlbumComment(Comments comments);
//    回复歌曲的评论
    boolean insertAlbumAnswer(Comments comments);
}

