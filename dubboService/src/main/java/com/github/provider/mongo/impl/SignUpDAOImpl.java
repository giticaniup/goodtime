package com.github.provider.mongo.impl;

import com.github.api.entity.SignUpInfo;
import com.github.provider.mongo.SignUpDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * signUpDAO
 */
@Repository
public class SignUpDAOImpl extends BaseOptionsImpl<SignUpInfo> implements SignUpDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    protected Class<SignUpInfo> getEntryClass() {
        return SignUpInfo.class;
    }

    @Override
    public List<String> listSignUpUsers(String activityId) {
        Query query = new Query();
        query.fields().include("name").include("phoneNumber");
        query.addCriteria(Criteria.where("_id").is(activityId));
        mongoTemplate.find(query, SignUpInfo.class);
        return null;
    }
}
