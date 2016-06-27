package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * unit test
 * Created by zhongcy on 2016/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class UserDiaryTest {

    @Autowired
    private UserDiaryServiceImpl userDiaryService;

    @Test
    public void testGet(){
        UserDiary userDiary = userDiaryService.findDiaryByUserId(1);
        System.out.println(userDiary);
    }
}
