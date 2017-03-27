package com.github.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = 7279435189529787706L;

    /**
     * 评论Id
     */
    private String id;

    /**
     * 评论发出者
     */
    private String fromUser;

    /**
     * 评论接收者
     */
    private String toUser;

    /**
     * 评论Target
     */
    private String targetId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论日期
     */
    private Date date;
}
