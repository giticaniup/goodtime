package com.github.provider.mongo;

import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Map;

/**
 * 基础操作类
 * Created by zhongcy on 2016/6/3.
 */
public interface BaseOptions<T> {
    /**
     * 添加
     */
    void add(T modelType);

    /**
     * id存在则修改，否则删除
     */
    void save(T modelType);

    /**
     * 修改满足条件的第一条记录
     */
    void updateFirst(T modelType);

    /**
     * 修改
     */
    void updateAll(T modelType);

    /**
     * 根据id删除
     */
    void delete(String id);

    /**
     * 根据id获取对象
     */
    T findById(String id);

    /**
     * 根据条件活动列表
     */
    List<T> findByParams(Map<String, Object> params);

    /**
     * 条件查询
     */
    T findOneByQuery(Query query);

    /**
     * 根据条件查询所有
     */
    List<T> findAllByQuery(Query query);

    /**
     * 创建表
     */
    void createCollection();

    /**
     * 删除表
     */
    void dropCollection();
}
