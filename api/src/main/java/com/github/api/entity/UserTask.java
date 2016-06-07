package com.github.api.entity;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

public class UserTask implements Serializable{

    private static final long serialVersionUID = 2190855450436823688L;

    private Integer taskId;

    private String taskName;

    private Integer userId;

    private String taskContent;

    private Date beginTime;

    private Date endTime;

    private Integer taskScore;

    private Integer taskCategory;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getTaskScore() {
        return taskScore;
    }

    public void setTaskScore(Integer taskScore) {
        this.taskScore = taskScore;
    }

    public Integer getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(Integer taskCategory) {
        this.taskCategory = taskCategory;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("taskId", taskId)
                .add("taskName", taskName)
                .add("userId", userId)
                .add("taskContent", taskContent)
                .add("beginTime", beginTime)
                .add("endTime", endTime)
                .add("taskScore", taskScore)
                .add("taskCategory", taskCategory)
                .toString();
    }
}