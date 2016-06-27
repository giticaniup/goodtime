package com.kode.test;

import com.github.api.entity.User;
import com.github.api.service.UserInfoService;
import com.github.provider.manager.ConfigManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class UserServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private ConfigManager configManager;

    @Test
    public void testUserTest() throws Exception {
        User user = userInfoService.userTest();
        System.out.println(user);
    }

    @Test
    public void testConfigManager(){
        System.out.println("redisIP"+configManager.getRedisIp());
    }

    @Test
    public void testRegister(){
        int result = -111;
        try {
            result = userInfoService.userRegister();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("result:"+result);
        }
    }
    @Test
    public void testDelete(){
        System.out.println(userInfoService.delete());
    }

}