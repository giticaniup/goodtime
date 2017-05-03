package com.github.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动
 * Created by zhongcy on 2017-02-25.
 */
@Data
public class Activity implements Serializable {
    private static final long serialVersionUID = -326968280448319090L;

    /**
     * id
     */
    private String id;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 活动内容
     */
    private String content;

    /**
     * 活动图片
     */
    private String[] imageUrl;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 活动结束时间
     */
    private Date endTime;

    /**
     * 活动状态
     */
    private int status;

    /**
     * 活动创建时间
     */
    private Date CreateTime;

    /**
     * 活动更新时间
     */
    private Date UpdateTime;
}
