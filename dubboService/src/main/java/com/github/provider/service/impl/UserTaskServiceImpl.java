package com.github.provider.service.impl;

import com.github.api.entity.UserTask;
import com.github.api.service.UserTaskService;
import com.github.provider.dao.UserTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现类
 * Created by zhongcy on 2016/6/7.
 */
@Service("userTaskService")
public class UserTaskServiceImpl implements UserTaskService {

    @Autowired
    private UserTaskMapper userTaskMapper;

    @Override
    public List<UserTask> findTaskListByUserId(Integer userId, String beginTime, String endTime) {
        return userTaskMapper.getUserTaskListByUserId(userId, beginTime, endTime);
    }

    @Override
    public UserTask getUserTaskById(String userTaskId) {
        return null;
    }

    @Override
    public boolean hasBegin(Integer taskId, long time) {
        return userTaskMapper.taskHasBegin(taskId, time) > 0;
    }
}
