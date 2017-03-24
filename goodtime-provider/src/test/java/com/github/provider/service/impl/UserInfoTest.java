package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import com.github.api.result.PagerResult;
import com.github.api.service.UserInfoService;
import com.github.provider.search.DataIndex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 测试
 * Created by zhongcy on 16-11-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class UserInfoTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testGet() {
        userInfoService.userTest();
    }
}
