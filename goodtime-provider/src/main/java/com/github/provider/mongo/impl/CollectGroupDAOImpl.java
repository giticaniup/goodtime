package com.github.provider.mongo.impl;

import com.github.api.entity.CollectGroup;
import com.github.provider.mongo.CollectGroupDAO;

/**
 * CollectGroupDAOImpl
 * Created by zhongcy on 2017-04-01.
 */
public class CollectGroupDAOImpl extends BaseOptionsImpl<CollectGroup> implements CollectGroupDAO {
    @Override
    protected Class<CollectGroup> getEntryClass() {
        return CollectGroup.class;
    }
}
