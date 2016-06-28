package com.github.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.MoreObjects;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class UserDiary implements Serializable{

    private static final long serialVersionUID = -133117827074266211L;

    /**
     * ID
     */
    private Long id;

    /**
     * 所属用户Id
     */
    private Integer userId;

    /**
     * 所属组别
     */
    private Integer groupId;

    /**
     * 日志标题
     */
    private String title;

    /**
     * 创建时间
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    /**
     * 最后修改时间
     */

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date modifyTime;
    /**
     * 内容
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("userId", userId)
                .add("groupId", groupId)
                .add("title", title)
                .add("createTime", createTime)
                .add("modifyTime", modifyTime)
                .add("content", content)
                .toString();
    }
}