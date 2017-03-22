package com.github.provider.service.impl;

import com.github.api.entity.Activity;
import com.github.api.service.ActivityService;
import com.github.provider.mongo.ActivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 活动Service实现类
 * Created by zhongcy on 2017-02-25.
 */
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDAO activityDAO;

    @Override
    public List<Activity> listActivity(String userId) {
        return activityDAO.listActivityByUserId(userId);
    }

    @Override
    public Activity getActivity(String id) {
        return activityDAO.findById(id);
    }

    @Override
    public void saveActivity(Activity activity) {
        activityDAO.add(activity);
    }

    @Override
    public boolean removeActivity(String id) {
        return false;
    }

    @Override
    public boolean updateActivity(Activity activity) {
        return false;
    }
}
