package com.github.api.entity;

import com.google.common.base.MoreObjects;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.Date;

/**
 * 回复
 */
@Data
public class Reply implements Serializable{

    private static final long serialVersionUID = -8042292826379099111L;

    /**
     * ReplyID
     */
    private String id;

    /**
     * 评论Id
     */
    private String commentId;

    /**
     * 评论发出者，不能为空
     */
    private String fromUser;

    /**
     * 回复XX的评论
     */
    private String toUser;

    /**
     * 回复内容
     */
    private String content;

    private Date date;
}
