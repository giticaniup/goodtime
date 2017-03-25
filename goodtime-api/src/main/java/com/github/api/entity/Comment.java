package com.github.api.entity;

import com.google.common.base.MoreObjects;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 评论
 */
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = 7279435189529787706L;

    private String id;

    private String userId;

    private String activityId;

    private String content;

    private Date date;

    private List<Reply> replys;
}
