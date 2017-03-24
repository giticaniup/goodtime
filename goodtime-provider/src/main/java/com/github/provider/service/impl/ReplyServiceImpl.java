package com.github.provider.service.impl;

import com.github.api.entity.Reply;
import com.github.api.service.ReplyService;
import com.github.common.code.ErrorCode;
import com.github.common.exception.BizException;
import com.github.provider.mongo.ReplyDAO;
import com.mongodb.WriteResult;
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

    @Override
    public void deleteReply(String id) {
        WriteResult result = replyDAO.delete(id);
        if (result.getN() <= 0) {
            throw new BizException(ErrorCode.PARAM_ERROR, "回复已被删除");
        }
    }
}
