package com.github.provider.service.impl;

import com.github.api.entity.UserDiary;
import com.github.api.service.UserDiaryService;
import com.github.provider.dao.UserDiaryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用户日志实现类
 * Created by zhongcy on 2016/6/27.
 */
@Service("userDiaryService")
public class UserDiaryServiceImpl implements UserDiaryService{

    private static final Logger logger = LoggerFactory.getLogger(UserDiaryServiceImpl.class);

    @Autowired
    private UserDiaryMapper userDiaryMapper;

    @Override
    public List<UserDiary> findDiaryByUserId(int userId,int pageSize,int pageNum) {
        int fromRow = pageNum * pageNum -1;
        return userDiaryMapper.selectByUserId(userId,fromRow,pageSize);
    }

    @Override
    public int saveUserDiary(UserDiary userDiary) {
        userDiary.setCreateTime(new Date());
        userDiary.setModifyTime(new Date());
        int result = userDiaryMapper.insert(userDiary);
        if(result!=1){
            logger.error("failed to saveUserDiary,param={}",userDiary);
        }
        return result;
    }
}
