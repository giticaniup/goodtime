package com.github.api.service;

import com.github.api.entity.Comment;

import java.util.List;

/**
 * 评论Service
 */
public interface CommentService {

    /**
     * 添加评论
     *
     * @param comment 评论
     */
    void saveComment(Comment comment);

    /**
     * 删除评论
     *
     * @param id 评论id
     */
    void removeComment(String id);

    /**
     * 根据目标Id获取评论
     *
     * @param id 目标Id
     * @return CommentList
     */
    List<Comment> listCommentByTargetId(String id);
}
