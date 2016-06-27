package com.github.api.service;

import com.github.api.entity.UserDiary;

/**
 * 用户日志Service
 * Created by zhongcy on 2016/6/27.
 */
public interface UserDiaryService {
    UserDiary findDiaryByUserId(int userId);
}
