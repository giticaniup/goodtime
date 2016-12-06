package com.github.provider.service.impl;

import com.github.api.entity.SystemMessage;
import com.github.api.service.SystemMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 系统消息单元测试类
 * Created by zhongcy on 16-12-6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class SystemMessageServiceImplTest {
    @Autowired
    private SystemMessageService systemMessageService;

    @Test
    public void testAdd(){
        SystemMessage message = new SystemMessage();
        message.setCreateTime(new Date());
        message.setId(5);
        systemMessageService.addSystemMessage(message);
    }
}
