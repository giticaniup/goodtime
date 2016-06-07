package com.github.api.service;

import com.github.api.entity.UserTask;

import java.util.Date;
import java.util.List;

/**
 * 用户任务接口
 * Created by zhongcy on 2016/6/7.
 */
public interface UserTaskService {

    /**
     * 根据用户Id获取用户任务
     */
    List<UserTask> findTaskListByUserId(Integer userId,String beginTime,String endTime);

    /**
     * 根据任务Id获取详情
     * @param userTaskId    任务Id
     */
    UserTask getUserTaskById(String userTaskId);

    /**
     * 判断任务是否已经开始
     */
    boolean hasBegin(Integer taskId,long time);
}
