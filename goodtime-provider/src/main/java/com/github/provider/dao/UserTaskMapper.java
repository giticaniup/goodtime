package com.github.provider.dao;

import com.github.api.entity.UserTask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserTaskMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(UserTask record);

    int insertSelective(UserTask record);

    UserTask selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(UserTask record);

    int updateByPrimaryKey(UserTask record);

    List<UserTask> getUserTaskListByUserId(@Param("userId") Integer userId, @Param("beginTime") String beginTime,
                                           @Param("endTime") String endTime);

    int taskHasBegin(@Param("taskId") Integer taskId, @Param("time") long time);
}