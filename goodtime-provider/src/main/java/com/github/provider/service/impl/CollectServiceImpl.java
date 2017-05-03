package com.github.provider.service.impl;

import com.github.api.entity.Collect;
import com.github.api.service.CollectService;
import com.github.provider.mongo.CollectDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 收藏Service
 * Created by zhongcy on 2017-04-01.
 */
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectDAO collectDAO;

    @Override
    public void saveCollect(Collect collect) {
        collectDAO.save(collect);
    }

    @Override
    public void removeCollect(String id) {
        collectDAO.delete(id);
    }
}
