package com.github.api.entity;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动
 * Created by zhongcy on 2017-02-25.
 */
public class Activity implements Serializable{
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

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String[] imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("title", title)
                .add("content", content)
                .add("imageUrl", imageUrl)
                .add("creator", creator)
                .add("startTime", startTime)
                .add("endTime", endTime)
                .add("status", status)
                .add("CreateTime", CreateTime)
                .add("UpdateTime", UpdateTime)
                .toString();
    }
}
