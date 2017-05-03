package com.github.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 收藏分组
 * Created by zhongcy on 2017-03-27.
 */
@Data
public class CollectGroup implements Serializable {

    private static final long serialVersionUID = 7656397307983261650L;

    /**
     * 分组Id
     */
    private String id;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 组名
     */
    private String groupName;

    /**
     * 创建时间
     */
    private Date createTime;
}
