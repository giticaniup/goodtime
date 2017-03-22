package com.github.provider.mongo.impl;

import com.github.api.entity.Activity;
import com.github.provider.mongo.ActivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ActivityDAO实现类
 * Created by zhongcy on 2017-02-25.
 */
@Repository
public class ActivityDAOImpl extends BaseOptionsImpl<Activity> implements ActivityDAO{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    protected Class<Activity> getEntryClass() {
        return Activity.class;
    }

    @Override
    public List<Activity> listActivityByUserId(String userId) {
        Query query = new Query().addCriteria(Criteria.where("creator").is(userId));
        return mongoTemplate.find(query,Activity.class);
    }
}
