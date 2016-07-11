package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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
        List<UserDiary> userDiaryList = userDiaryService.findDiaryByUserId(1,2,1);
        Assert.assertEquals(userDiaryList.size(),2);
    }

    @Test
    public void testGetByDate(){
        List<UserDiary> userDiaryList = userDiaryService.findDiaryByDate(1,2,1,2016,6);
        Assert.assertEquals(2,userDiaryList.size());
    }
}
