package com.github.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 收藏
 * Created by zhongcy on 2017-03-27.
 */
@Data
public class Collect implements Serializable {

    private static final long serialVersionUID = 7620528238351703885L;

    /**
     * 组Id
     */
    private String groupId;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 活动Id
     */
    private String activityId;
}
