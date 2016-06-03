package com.github.provider.mongo.impl;

import com.github.provider.mongo.BaseOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Map;

/**
 * 数据基础操作类
 * Created by zhongcy on 2016/6/3.
 */
public abstract class BaseOptionsImpl<T> implements BaseOptions<T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    protected abstract Class<T> getEntryClass();

    /**
     * 添加表数据，没有则先创建表再添加
     */
    @Override
    public void add(T modelType) {
        createCollection();
        mongoTemplate.insert(modelType);
    }

    /**
     * 保存表数据，表不存在则创建，然后添加数据 存在如果id存在则修改表数据，id为空则条件表数据
     */
    @Override
    public void save(T modelType) {
        createCollection();
        mongoTemplate.save(modelType);
    }

    /**
     * 修改满足条件的第一条数据未实现
     */
    @Override
    public void updateFirst(T modelType) {
    }

    /**
     * 修改所有满足条件的数据未实现
     */
    @Override
    public void updateAll(T modelType) {
    }

    /**
     * 根据对象中的id删除数据
     */
    @Override
    public void delete(String id) {
        mongoTemplate.remove(id);
    }


    /**
     * 根据id获取表数据
     */
    @Override
    public T findById(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("_id").is(id);
        query.addCriteria(criteria);
        return findOneByQuery(query);
    }

    /**
     * 根据条件获取所有满足条件的表数据
     */
    @Override
    public List<T> findByParams(Map<String, Object> params) {
        Query query = new Query();
        Criteria criteria = Criteria.where("");
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                criteria = Criteria.where(entry.getKey()).is(entry.getValue());
            }
        }
        query.addCriteria(criteria);
        return findAllByQuery(query);
    }

    /**
     * 查询满足条件的第一条数据
     */
    @Override
    public T findOneByQuery(Query query) {
        return mongoTemplate.findOne(query, this.getEntryClass());
    }

    /**
     * 查询所有满足条件的数据列表
     */
    @Override
    public List<T> findAllByQuery(Query query) {
        return mongoTemplate.find(query, this.getEntryClass());
    }

    /**
     * 如果表不存在则创建表
     */
    @Override
    public void createCollection() {
        if (!mongoTemplate.collectionExists(this.getEntryClass())) {
            mongoTemplate.createCollection(this.getEntryClass());
        }
    }

    /**
     * 如果表存在则删除表
     */
    @Override
    public void dropCollection() {
        if (!mongoTemplate.collectionExists(this.getEntryClass())) {
            mongoTemplate.dropCollection(this.getEntryClass());
        }
    }
}
