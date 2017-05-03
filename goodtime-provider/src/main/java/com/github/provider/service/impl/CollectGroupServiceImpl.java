package com.github.provider.service.impl;

import com.github.api.entity.CollectGroup;
import com.github.api.service.CollectGroupService;
import com.github.provider.mongo.CollectGroupDAO;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * 收藏夹Service实现类
 * Created by zhongcy on 2017-04-01.
 */
public class CollectGroupServiceImpl implements CollectGroupService {

    @Autowired
    private CollectGroupDAO collectGroupDAO;

    @Override
    public void saveCollectGroup(CollectGroup collectGroup) {
        collectGroupDAO.save(collectGroup);
    }

    @Override
    public void removeCollectGroup(String groupId) {
        collectGroupDAO.delete(groupId);
    }

    @Override
    public void changeGroupName(String id, String name) {
        Map<String, Object> params = ImmutableMap.of("name", name);
        collectGroupDAO.updateById(id, params);
    }
}
