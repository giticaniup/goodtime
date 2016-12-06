package com.github.provider.service.impl;

import com.github.api.entity.SystemMessage;
import com.github.api.service.SystemMessageService;
import com.github.provider.mongo.SystemMessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统消息服务实现类
 * Created by zhongcy on 16-12-5.
 */

@Service("systemMessageService")
public class SystemMessageSerivceImpl implements SystemMessageService {

    @Autowired
    private SystemMessageDao systemMessageDao;

    @Override
    public void addSystemMessage(SystemMessage systemMessage) {
        systemMessageDao.add(systemMessage);
    }

    @Override
    public List<SystemMessage> getSystemMessage() {
        return systemMessageDao.findAllByQuery(null);
    }

    @Override
    public void markSystemMessage(Integer id) {
        Criteria criteria = new Criteria();
        criteria.and("id").is(id);
        systemMessageDao.findOneByQuery(new Query(criteria));
    }
}
