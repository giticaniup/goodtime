package com.github.api.service;

import com.github.api.entity.UserDiary;
import com.github.api.result.PagerResult;

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
    PagerResult<List<UserDiary>> findDiaryByUserId(Integer userId, int pageSize, int pageNum);

    /**
     * 根据日期查询人员日志
     *
     * @param userId
     * @param pageSize
     * @param pageNum
     * @return
     */
    PagerResult<List<UserDiary>> findDiaryByDate(Integer userId, int pageSize, int pageNum, int year, int month);

    /**
     * 日志保存
     *
     * @param userDiary
     * @return
     */
    void saveUserDiary(UserDiary userDiary);

    UserDiary findDiaryById(Long id);

    void updateUserDiary(UserDiary userDiary);

    void deleteUserDiary(Long id);

    List<UserDiary> getDiaryByGroup(Integer userId,Integer groupId);
}
