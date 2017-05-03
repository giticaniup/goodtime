package com.github.provider.mongo.impl;

import com.github.api.entity.Collect;
import com.github.provider.mongo.CollectDAO;

/**
 * CollectDAOImpl
 * Created by zhongcy on 2017-04-01.
 */
public class CollectDAOImpl extends BaseOptionsImpl<Collect> implements CollectDAO {
    @Override
    protected Class<Collect> getEntryClass() {
        return Collect.class;
    }
}
