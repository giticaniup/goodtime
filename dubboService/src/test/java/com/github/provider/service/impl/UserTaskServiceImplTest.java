package com.github.provider.service.impl;

import com.github.api.entity.UserTask;
import com.github.common.utils.DateTimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.JodaTimeConverters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * 用户任务单元测试类
 * Created by zhongcy on 2016/6/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class UserTaskServiceImplTest {

    private final static Logger logger = LoggerFactory.getLogger(UserTaskServiceImplTest.class);

    @Autowired

    private UserTaskServiceImpl userTaskService;

    @Test
    public void testFindTaskListByUserId() throws Exception {
        LocalDateTime beginTime = LocalDateTime.of(2000,12,12,12,12);
        LocalDateTime endTime = LocalDateTime.of(2016,06,01,12,12);
        String dateStr = "2000-10-10 10:10:10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateStr);
        System.out.println(date);
        List<UserTask> userTaskList = userTaskService.findTaskListByUserId(1,dateStr,"2016-10-10 10:10:10");
        System.out.println(endTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(userTaskList);
    }

    @Test
    public void testTime(){
        LocalDateTime endTime = LocalDateTime.of(2016,01,01,12,12);
        System.out.println(endTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2012-01-01 11:11:11", dtf);
        Instant instant = dateTime.toInstant(ZoneOffset.UTC);
        System.out.println();
        System.out.println(instant.toEpochMilli());
    }

    @Test
    public void testHasBegin(){
        Date date = new Date();
        logger.info("-----------------");
        userTaskService.hasBegin(1,date.getTime());
    }

    @Test
    public void testInsert(){
        UserTask userTask = new UserTask();
        userTask.setUserId(1);
        userTask.setBeginTime(new Date());
        userTask.setEndTime(new Date());
        userTask.setTaskName("测试");
        userTask.setTaskContent("测试内容");
        userTaskService.insertUserTask(userTask);
    }
}