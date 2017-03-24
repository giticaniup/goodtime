package com.github.api.service;

import com.github.api.entity.Comment;

/**
 * 评论Service
 */
public interface CommentService {

    void saveComment(Comment comment);
}
