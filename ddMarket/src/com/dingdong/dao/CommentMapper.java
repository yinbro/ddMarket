package com.dingdong.dao;

import java.awt.List;

import com.dingdong.pojo.Comment;

public interface CommentMapper {
    boolean deleteByComentID(Integer commentId);

    boolean insert(Comment record);

    Comment findCommentByCommentID(Integer commentId);

    List findCommentByItemID(Comment record);

    boolean update(Comment record);

    int updateByPrimaryKey(Comment record);
}