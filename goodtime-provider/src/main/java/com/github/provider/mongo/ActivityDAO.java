package com.github.provider.mongo;

import com.github.api.entity.Activity;

import java.util.List;

/**
 * ActivityDAO
 * Created by zhongcy on 2017-02-25.
 */
public interface ActivityDAO extends BaseOptions<Activity> {
    List<Activity> listActivityByUserId(String userId);
}
