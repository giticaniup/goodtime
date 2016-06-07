package com.github.provider.service.impl;


import com.github.api.entity.User;
import com.github.api.service.UserInfoService;
import com.github.common.utils.JedisUtils;
import com.github.provider.dao.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户Service类
 * Created by zhongcy on 2016/5/12.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GenericJackson2JsonRedisSerializer serializer;

    @Autowired
    private StringRedisSerializer stringRedisSerializer;

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Override
    @Cacheable(value = {"userCache"})
    public User userTest() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    //@Cacheable(value = {"userCache"}, key = "#id")
    public User selectById(int id) {
        logger.info("sellectById");
        User user = userMapper.selectByPrimaryKey(id);
        JedisUtils.setObjValue(stringRedisSerializer.serialize(String.valueOf(id)), serializer.serialize(user));
        return user;
    }

    @Override
    public int updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
        return 0;
    }

    @Override
    public int userRegister() {
        User user = new User();
        user.setUserId(2);
        user.setAge(22);
        user.setBirthday(new Date());
        user.setGender(0);
        user.setName("lbq");
        user.setPassword("11");
        user.setUserName("lbq");
        userMapper.insert(user);
        //throw new RuntimeException();
        return userMapper.insert(user);
    }
}
