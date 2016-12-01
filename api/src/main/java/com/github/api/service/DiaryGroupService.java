package com.github.api.service;

import com.github.api.entity.DiaryGroup;

import java.util.List;

/**
 * 日志类别Service
 * Created by zhongcy on 2016/11/30.
 */
public interface DiaryGroupService {

    /**
     * 获取日志类别
     */
    List<DiaryGroup> getDiaryGroup(Integer userId);

    /**
     * 增加日志类别
     */
    void addDiaryGroup(DiaryGroup diaryGroup);

    /**
     * 修改日志类别
     */
    void updateDiaryGroup(DiaryGroup diaryGroup);

    /**
     * 删除日志类别
     */
    void deleteDiaryGroup(Integer id);
}
