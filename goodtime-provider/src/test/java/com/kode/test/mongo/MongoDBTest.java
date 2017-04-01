package com.kode.test.mongo;

import com.github.api.entity.UserMessage;
import com.github.provider.mongo.impl.UserMessageDAOImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * mongo测试类
 * Created by zhongcy on 2016/6/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class MongoDBTest {
    @Autowired
    private UserMessageDAOImpl messageDao;

    @Test
    public void testMongo(){
        UserMessage userMessage = new UserMessage();
        userMessage.setMessageId("1");
        userMessage.setUserId(1);
        userMessage.setMessageContent("消息");
        messageDao.add(userMessage);
    }
}
