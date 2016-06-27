package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import com.github.api.service.UserDiaryService;
import com.github.provider.dao.UserDiaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户日志实现类
 * Created by zhongcy on 2016/6/27.
 */
@Service
public class UserDiaryServiceImpl implements UserDiaryService{

    @Autowired
    private UserDiaryMapper userDiaryMapper;

    @Override
    public UserDiary findDiaryByUserId(int userId) {
        return userDiaryMapper.selectByUserId(userId);
    }
}
