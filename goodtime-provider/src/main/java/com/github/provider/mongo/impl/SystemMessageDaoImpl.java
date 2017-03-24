package com.github.provider.mongo.impl;

import com.github.api.entity.SystemMessage;
import com.github.provider.mongo.SystemMessageDao;
import org.springframework.stereotype.Repository;

/**
 * 系统消息DAO实现类
 * Created by zhongcy on 16-12-5.
 */
@Repository
public class SystemMessageDaoImpl extends BaseOptionsImpl<SystemMessage> implements SystemMessageDao{
    @Override
    protected Class<SystemMessage> getEntryClass() {
        return SystemMessage.class;
    }
}
