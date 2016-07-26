package com.github.provider.service.impl;

import com.github.api.result.FindDiaryResult;
import com.github.provider.search.DataIndex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(UserDiaryTest.class);

    @Autowired
    private UserDiaryServiceImpl userDiaryService;

    @Autowired
    private DataIndex dataIndex;

    @Test
    public void testGet() {
        FindDiaryResult findDiaryResult = userDiaryService.findDiaryByUserId(1, 2, 1);
        Assert.assertEquals(2, findDiaryResult.getUserDiaries().size());
        logger.info(String.valueOf(findDiaryResult.getTotalCount()));
        logger.info(String.valueOf(findDiaryResult.getPageCount()));
    }

    @Test
    public void testGetByDate() {
        FindDiaryResult findDiaryResult = userDiaryService.findDiaryByDate(1, 2, 1, 2016, 6);
        Assert.assertEquals(2, findDiaryResult.getUserDiaries().size());
        logger.info(String.valueOf(findDiaryResult.getTotalCount()));
        logger.info(String.valueOf(findDiaryResult.getPageCount()));
    }

    @Test
    public void testSolr(){
        dataIndex.indexData();
    }

}
