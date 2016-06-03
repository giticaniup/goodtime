package com.github.api.service;

import com.github.api.entity.User;

/**
 * 用户操作service
 * Created by zhongcy on 2016/5/19.
 */
public interface UserInfoService {

    int userRegister();

    User userTest();

    User selectById(int id);

    int updateUser(User user);
}
