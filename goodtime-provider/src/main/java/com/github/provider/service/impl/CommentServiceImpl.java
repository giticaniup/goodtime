package com.github.provider.service.impl;

import com.github.api.entity.Comment;
import com.github.api.service.CommentService;
import com.github.common.code.ErrorCode;
import com.github.common.exception.BizException;
import com.github.provider.mongo.CommentDAO;
import com.google.common.collect.ImmutableMap;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public void removeComment(String id) {
        WriteResult result = commentDAO.delete(id);
        if (result.getN() <= 0) {
            throw new BizException(ErrorCode.PARAM_ERROR, "评论不存在或已删除");
        }
    }

    @Override
    public List<Comment> listCommentByTargetId(String targetId) {
        Map<String, Object> params = ImmutableMap.of("targetId", targetId);
        return commentDAO.findByParams(params);
    }
}
