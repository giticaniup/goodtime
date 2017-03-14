package com.github.provider.mongo.impl;

import com.github.api.entity.Reply;
import com.github.provider.mongo.ReplyDAO;
import org.springframework.stereotype.Repository;

/**
 * 回复DAO
 * Created by zhongcy on 2017-03-14.
 */
@Repository
public class ReplyDAOImpl extends BaseOptionsImpl<Reply> implements ReplyDAO{
    @Override
    protected Class<Reply> getEntryClass() {
        return Reply.class;
    }
}
