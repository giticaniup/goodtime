package com.github.provider.service.impl;

import com.github.api.entity.Activity;
import com.github.api.entity.Like;
import com.github.api.service.LikeService;
import com.github.common.code.ErrorCode;
import com.github.common.exception.BizException;
import com.github.provider.mongo.ActivityDAO;
import com.github.provider.mongo.LikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 点赞
 * Created by zhongcy on 2017-03-25.
 */
@Service("likeService")
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeDAO likeDAO;

    @Autowired
    private ActivityDAO activityDAO;

    @Override
    public void saveLike(Like like) {
        Activity activity = activityDAO.findById(like.getActivityId());
        if (activity == null) {
            throw new BizException(ErrorCode.PARAM_ERROR, "活动不存在或已被删除，请刷新页面");
        }
        likeDAO.save(like);
    }

    @Override
    public void removeLike(String likeId) {
        likeDAO.delete(likeId);
    }
}
