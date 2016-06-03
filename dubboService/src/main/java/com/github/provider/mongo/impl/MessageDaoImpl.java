package com.github.provider.mongo.impl;

import com.github.api.entity.UserMessage;
import com.github.provider.mongo.MessageDao;
import org.springframework.stereotype.Repository;

/**
 * Created by zhongcy on 2016/6/3.
 */
@Repository
public class MessageDaoImpl extends BaseOptionsImpl<UserMessage> implements MessageDao {
    @Override
    protected Class<UserMessage> getEntryClass() {
        return UserMessage.class;
    }
}
