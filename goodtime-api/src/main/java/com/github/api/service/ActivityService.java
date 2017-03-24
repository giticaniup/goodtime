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

    void saveActivity(Activity activity);

    boolean removeActivity(String id);

    boolean updateActivity(Activity activity);
}
