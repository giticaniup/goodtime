package com.github.api.service;

import com.github.api.entity.UserDiary;

import java.util.List;

/**
 * 用户日志Service
 * Created by zhongcy on 2016/6/27.
 */
public interface UserDiaryService {
    List<UserDiary> findDiaryByUserId(int userId,int pageSize,int pageNum);

    int saveUserDiary(UserDiary userDiary);
}
