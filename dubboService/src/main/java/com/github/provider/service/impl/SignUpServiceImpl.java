package com.github.provider.service.impl;

import com.github.api.entity.Activity;
import com.github.api.entity.SignUpInfo;
import com.github.api.service.SignUpService;
import com.github.common.code.AjaxCode;
import com.github.common.exception.BizException;
import com.github.provider.constants.ActivityStatus;
import com.github.provider.mongo.ActivityDAO;
import com.github.provider.mongo.SignUpDAO;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 报名服务
 */
@Service("signUpService")
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private ActivityDAO activityDAO;

    @Autowired
    private SignUpDAO signUpDAO;


    @Override
    public void signUpActivity(SignUpInfo info) {
        Activity activity = activityDAO.findById(info.getActivityId());
        if (activity == null) {
            throw new BizException(AjaxCode.PARAM_ERROR, "该活动不存在！");
        }
        if (activity.getStatus() == ActivityStatus.ALREADY_CANCELED.getStatus()) {
            throw new BizException(AjaxCode.PARAM_ERROR, "该活动已经取消！");
        }
        if (activity.getStatus() == ActivityStatus.ALREADY_OVER.getStatus()) {
            throw new BizException(AjaxCode.PARAM_ERROR, "该活动已经结束，下次早点哦！");
        }
        Map<String, Object> map = ImmutableMap.<String, Object>builder().put("activityId", info.getActivityId())
                .put("userId", info.getUserId()).build();
        long count = signUpDAO.findCountByParams(map);
        if (count > 0) {
            throw new BizException(AjaxCode.PARAM_ERROR, "您已经报名了！");
        }
        signUpDAO.add(info);
    }

    @Override
    public List<String> listSignUpUsers(String activityId) {
        return signUpDAO.listSignUpUsers(activityId);
    }
}
