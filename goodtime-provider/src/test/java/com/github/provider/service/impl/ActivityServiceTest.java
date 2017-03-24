package com.github.provider.service.impl;

import com.github.api.entity.Activity;
import com.github.api.service.ActivityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Activity单元测试类
 * Created by zhongcy on 2017-02-25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class ActivityServiceTest {
    @Autowired
    private ActivityService activityService;

    @Test
    public void testAdd(){
        String[] imageUrl = {"http://baidu.com"};
        Activity activity = new Activity();
        activity.setTitle("测试1");
        activity.setContent("测试内容");
        activity.setCreateTime(new Date());
        activity.setImageUrl(imageUrl);
        activity.setCreator("钟乘永");
        activityService.saveActivity(activity);
    }

    @Test
    public void testGetActivity(){
        Activity activity = activityService.getActivity("58b190d4b917c82d6c73d6e7");
        System.out.println(activity);
    }

    @Test
    public void testListActivity(){
        System.out.println(activityService.listActivity("钟乘永"));
    }

    @Test
    public void updateActivity() throws IllegalAccessException {
        Activity activity = new Activity();
        activity.setId("58b3d39b03d7f52858209b9e");
        activity.setTitle("修改测试");
        activityService.updateActivity(activity);
    }
}
