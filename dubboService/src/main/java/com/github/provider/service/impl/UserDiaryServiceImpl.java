package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import com.github.api.result.PagerResult;
import com.github.api.service.UserDiaryService;
import com.github.provider.dao.UserDiaryMapper;
import com.github.provider.utils.PagingUtil;
import com.google.common.base.Joiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用户日志实现类
 * Created by zhongcy on 2016/6/27.
 */
@Service("userDiaryService")
public class UserDiaryServiceImpl implements UserDiaryService {

    @Autowired
    private UserDiaryMapper userDiaryMapper;

    @Override
    public PagerResult<List<UserDiary>> findDiaryByUserId(int userId, int pageSize, int pageNum) {
        int fromRow = (pageNum - 1) * pageSize;
        List<UserDiary> userDiaries = userDiaryMapper.selectByUserId(userId, fromRow, pageSize);
        int totalCount = userDiaryMapper.selectCount(userId, null, null);
        PagerResult<List<UserDiary>> result = new PagerResult<>();
        result.setData(userDiaries);
        PagingUtil.pagingData(result, totalCount, pageSize, pageNum);
        return result;
    }

    @Override
    public PagerResult<List<UserDiary>> findDiaryByDate(int userId, int pageSize, int pageNum, int year, int month) {
        int fromRow = (pageNum - 1) * pageSize;
        String beginTime = Joiner.on("-").join(year, "0" + month);
        String endTime = Joiner.on("-").join(year, "0" + (month + 1));

        List<UserDiary> userDiaries = userDiaryMapper.selectByDate(userId, fromRow, pageSize, beginTime, endTime);
        int totalCount = userDiaryMapper.selectCount(userId, beginTime, endTime);

        PagerResult<List<UserDiary>> result = new PagerResult<>();
        result.setData(userDiaries);
        PagingUtil.pagingData(result, totalCount, pageSize, pageNum);
        return result;
    }

    @Override
    public void saveUserDiary(UserDiary userDiary) {
        userDiary.setCreateTime(new Date());
        userDiary.setModifyTime(new Date());
        userDiaryMapper.insert(userDiary);
    }
}
