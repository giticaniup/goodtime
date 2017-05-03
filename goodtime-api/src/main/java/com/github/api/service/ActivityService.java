package com.github.api.service;

import com.github.api.entity.Activity;

import java.util.List;

/**
 * 活动Service
 * Created by zhongcy on 2017-02-25.
 */
public interface ActivityService {
    /**
     * 获取所有活动列表
     */
    List<Activity> listActivity(String userId);

    /**
     * 根据Id获取详情
     */
    Activity getActivity(String id);

    /**
     * 添加活动
     * @param activity 活动
     */
    void saveActivity(Activity activity);

    /**
     * 删除活动
     * @param id 活动id
     * @return 是否删除成功
     */
    boolean removeActivity(String id);

    /**
     * 更新活动
     * @param activity 活动
     * @return 是否更新成功
     * @throws IllegalAccessException 反射异常
     */
    boolean updateActivity(Activity activity) throws IllegalAccessException;
}
