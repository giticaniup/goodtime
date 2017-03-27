package com.github.api.service;

import com.github.api.entity.Collect;

/**
 * 收藏Service
 * Created by zhongcy on 2017-03-27.
 */
public interface CollectService {

    /**
     * 添加收藏
     * @param collect 收藏
     */
    void saveCollect(Collect collect);

    /**
     * 取消收藏
     * @param id 收藏Id
     */
    void removeCollect(String id);
}
