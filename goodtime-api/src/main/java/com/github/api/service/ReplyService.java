package com.github.api.service;

import com.github.api.entity.Reply;

/**
 * 回复Service
 */
public interface ReplyService {

    /**
     * 添加回复
     *
     * @param reply 添加回复
     */
    void saveReply(Reply reply);

    /**
     * 删除回复
     *
     * @param id 回复id
     */
    void deleteReply(String id);
}
