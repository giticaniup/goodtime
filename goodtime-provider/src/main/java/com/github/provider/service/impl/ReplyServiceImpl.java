package com.github.provider.service.impl;

import com.github.api.entity.Reply;
import com.github.api.service.ReplyService;
import com.github.provider.mongo.ReplyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 回复Service
 */
@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyDAO replyDAO;

    @Override
    public void saveReply(Reply reply) {
        replyDAO.save(reply);
    }
}
