package com.github.api.service;

import com.github.api.entity.UserDiary;

import java.util.List;

/**
 * 用户日志Service
 * Created by zhongcy on 2016/6/27.
 */
public interface UserDiaryService {

    /**
     * 根据用户Id查询日志
     *
     * @param userId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UserDiary> findDiaryById(int userId, int pageSize, int pageNum);

    /**
     * 根据日期查询人员日志
     *
     * @param userId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UserDiary> findDiaryByDate(int userId, int pageSize, int pageNum, int year, int month);

    /**
     * 日志保存
     *
     * @param userDiary
     * @return
     */
    int saveUserDiary(UserDiary userDiary);
}
