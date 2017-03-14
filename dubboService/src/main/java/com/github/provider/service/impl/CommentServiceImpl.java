package com.github.provider.service.impl;

import com.github.api.entity.Comment;
import com.github.api.service.CommentService;
import com.github.provider.mongo.CommentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评论Service
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDAO commentDAO;

    @Override
    public void saveComment(Comment comment) {
        commentDAO.save(comment);
    }
}
