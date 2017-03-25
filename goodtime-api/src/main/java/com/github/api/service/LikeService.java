package com.github.api.service;

import com.github.api.entity.Like;

/**
 * 点赞/取消赞service
 * Created by zhongcy on 2017-03-25.
 */
public interface LikeService {

    /**
     * 点赞
     * @param like 赞
     */
    void saveLike(Like like);

    /**
     * 取消赞
     * @param likeId 赞id
     */
    void removeLike(String likeId);
}
