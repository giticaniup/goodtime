package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import com.github.api.result.PagerResult;
import com.github.provider.search.DataIndex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 用户日志单元测试类
 * Created by zhongcy on 2016/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-dubbo.xml")
public class UserDiaryTest {

    private static final Logger logger = LoggerFactory.getLogger(UserDiaryTest.class);

    @Autowired
    private UserDiaryServiceImpl userDiaryService;

    @Autowired
    private DataIndex dataIndex;

    @Test
    public void testGet() {
        PagerResult<List<UserDiary>> result = userDiaryService.findDiaryByUserId(1, 2, 1);
        logger.info(String.valueOf(result.getTotalCount()));
        logger.info(String.valueOf(result.getPageCount()));
        logger.info(String.valueOf(result.getData()));
    }

    @Test
    public void testGetByDate() {
        PagerResult<List<UserDiary>> findDiaryResult = userDiaryService.findDiaryByDate(1, 2, 1, 2016, 6);
        logger.info(String.valueOf(findDiaryResult.getTotalCount()));
        logger.info(String.valueOf(findDiaryResult.getPageCount()));
    }

    @Test
    public void testSolr() {
        dataIndex.indexData();
    }

}
