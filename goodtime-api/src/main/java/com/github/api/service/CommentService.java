package com.github.api.service;

import com.github.api.entity.Comment;

/**
 * 评论Service
 */
public interface CommentService {

    /**
     * 添加评论
     * @param comment 评论
     */
    void saveComment(Comment comment);

    /**
     * 删除评论
     * @param id 评论id
     */
    void deleteComment(String id);
}
