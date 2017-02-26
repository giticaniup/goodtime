package com.github.provider.mongo.impl;

import com.github.api.entity.Activity;
import com.github.provider.mongo.ActivityDAO;
import org.springframework.stereotype.Repository;

/**
 * ActivityDAO实现类
 * Created by zhongcy on 2017-02-25.
 */
@Repository
public class ActivityDAOImpl extends BaseOptionsImpl<Activity> implements ActivityDAO{
    @Override
    protected Class<Activity> getEntryClass() {
        return Activity.class;
    }
}
