package com.github.api.entity;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 用户消息
 * Created by zhongcy on 2016/6/3.
 */
public class UserMessage implements Serializable{
    private static final long serialVersionUID = -331732413340776970L;

    private String messageId;

    private String messageContent;

    private Integer userId;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("messageId", messageId)
                .add("messageContent", messageContent)
                .add("userId", userId)
                .toString();
    }
}
