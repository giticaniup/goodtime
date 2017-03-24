package com.github.provider.service.impl;

import com.github.api.entity.Activity;
import com.github.api.service.ActivityService;
import com.github.common.code.ErrorCode;
import com.github.common.exception.BizException;
import com.github.provider.constants.ActivityStatus;
import com.github.provider.mongo.ActivityDAO;
import com.mongodb.WriteResult;
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
        WriteResult result = activityDAO.delete(id);
        if (result.getN() == 0) {
            throw new BizException(ErrorCode.PARAM_ERROR, "活动已被删除");
        }
        return true;
    }

    @Override
    public boolean updateActivity(Activity activity) throws IllegalAccessException {
        Activity activityData = activityDAO.findById(activity.getId());
        if (activityData == null) {
            throw new BizException(ErrorCode.PARAM_ERROR, "活动不存在或已删除");
        }
        if (activityData.getStatus() > ActivityStatus.IN_PROGRESS.getStatus()) {
            throw new BizException(ErrorCode.PARAM_ERROR, "活动已经结束或取消，不允许修改");
        }
        activityDAO.updateFirst(activity);
        return true;
    }
}
