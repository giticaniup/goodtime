package com.github.provider.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置文件信息读取类
 * Created by zhongcy on 2016/6/6.
 */
@Component("configManager")
public class ConfigManager {

    @Value("${redis.host}")
    private String redisIp;

    @Value("${redis.port}")
    private int redisPort;

    @Value("${redis.database}")
    private int database;

    public String getRedisIp() {
        return redisIp;
    }

    public void setRedisIp(String redisIp) {
        this.redisIp = redisIp;
    }

    public int getDatabase() {
        return database;
    }

    public void setDatabase(int database) {
        this.database = database;
    }

    public int getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(int redisPort) {
        this.redisPort = redisPort;
    }
}
