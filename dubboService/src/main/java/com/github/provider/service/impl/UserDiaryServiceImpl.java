package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import com.github.api.result.FindDiaryResult;
import com.github.api.service.UserDiaryService;
import com.github.provider.dao.UserDiaryMapper;
import com.google.common.base.Joiner;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

/**
 * 用户日志实现类
 * Created by zhongcy on 2016/6/27.
 */
@Service("userDiaryService")
public class UserDiaryServiceImpl implements UserDiaryService {

    private static final Logger logger = LoggerFactory.getLogger(UserDiaryServiceImpl.class);

    @Autowired
    private UserDiaryMapper userDiaryMapper;

    @Override
    public FindDiaryResult findDiaryByUserId(int userId, int pageSize, int pageNum) {
        int fromRow = (pageNum - 1) * pageSize;
        List<UserDiary> userDiaries = userDiaryMapper.selectByUserId(userId, fromRow, pageSize);
        int totalCount = userDiaryMapper.selectCount(userId, null, null);
        int pageCount = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        FindDiaryResult findDiaryResult = new FindDiaryResult();
        setFindDiaryResult(findDiaryResult, userDiaries, totalCount, pageCount);
        return findDiaryResult;
    }

    @Override
    public FindDiaryResult findDiaryByDate(int userId, int pageSize, int pageNum, int year, int month) {
        int fromRow = (pageNum - 1) * pageSize;
        String beginTime = Joiner.on("-").join(year, "0" + month);
        String endTime = Joiner.on("-").join(year, "0" + (month + 1));

        List<UserDiary> userDiaries = userDiaryMapper.selectByDate(userId, fromRow, pageSize, beginTime, endTime);
        int totalCount = userDiaryMapper.selectCount(userId, beginTime, endTime);
        int pageCount = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        FindDiaryResult findDiaryResult = new FindDiaryResult();
        setFindDiaryResult(findDiaryResult, userDiaries, totalCount, pageCount);
        return findDiaryResult;
    }

    @Override
    public int saveUserDiary(UserDiary userDiary) {
        userDiary.setCreateTime(new Date());
        userDiary.setModifyTime(new Date());
        int result = userDiaryMapper.insert(userDiary);
        if (result != 1) {
            logger.error("failed to saveUserDiary,param={}", userDiary);
        }
        return result;
    }

    private void setFindDiaryResult(FindDiaryResult findDiaryResult, List<UserDiary> userDiaries,
                                    int totalCount, int pageCount) {
        try {
            BeanUtils.setProperty(findDiaryResult, "userDiaries", userDiaries);
            BeanUtils.setProperty(findDiaryResult, "totalCount", totalCount);
            BeanUtils.setProperty(findDiaryResult, "pageCount", pageCount);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
