package com.github.api.entity;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
public class Comment implements Serializable {

    private static final long serialVersionUID = 7279435189529787706L;

    private String id;

    private String userId;

    private String activityId;

    private String content;

    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("userId", userId)
                .add("activityId", activityId)
                .add("content", content)
                .add("date", date)
                .toString();
    }
}
