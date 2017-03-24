package com.github.api.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * 赞
 * Created by zhongcy on 2017-03-24.
 */

@Data
public class Like implements Serializable {
    private static final long serialVersionUID = 4680525788796670118L;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 点赞时间
     */
    private long likeTime;

    /**
     * 头像URL
     */
    private String profileImage;
}
