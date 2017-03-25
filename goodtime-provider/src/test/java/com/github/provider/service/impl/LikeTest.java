package com.github.provider.service.impl;

import com.github.api.entity.Like;
import com.github.api.service.LikeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 点赞test
 * Created by zhongcy on 2017-03-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class LikeTest {

    @Autowired
    private LikeService likeService;

    @Test
    public void testLombok(){
        Like like = new Like();
        like.setLikeTime(System.currentTimeMillis());
        System.out.println(like);
    }

    @Test
    public void testSaveLike(){
        Like like = new Like();
        like.setActivityId("58b190d4b917c82d6c73d6e7");
        like.setLikeTime(System.currentTimeMillis());
        like.setUserId("zhongcy");
        like.setUserName("zhongcy");
        likeService.saveLike(like);
    }
}
