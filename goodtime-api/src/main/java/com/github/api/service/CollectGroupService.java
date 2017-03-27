package com.github.api.service;

import com.github.api.entity.CollectGroup;

/**
 * 收藏分组Service
 * Created by zhongcy on 2017-03-27.
 */
public interface CollectGroupService {

    /**
     * 新建收藏分组
     *
     * @param collectGroup 分组
     */
    void saveCollectGroup(CollectGroup collectGroup);

    /**
     * 删除收藏分组
     *
     * @param groupId 分组Id
     */
    void removeCollectGroup(String groupId);

    /**
     * 修改分组名称
     * @param id 分组Id
     * @param name 分组名
     */
    void changeGroupName(String id, String name);
}
