package com.github.provider.mongo.impl;

import com.github.api.entity.Comment;
import com.github.provider.mongo.CommentDAO;
import org.springframework.stereotype.Repository;

/**
 * 评论DAO
 */
@Repository
public class CommentDAOImpl extends BaseOptionsImpl<Comment> implements CommentDAO {
    @Override
    protected Class<Comment> getEntryClass() {
        return Comment.class;
    }
}
