package com.github.api.entity;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

public class DiaryGroup implements Serializable{

    private static final long serialVersionUID = 4508500961816916937L;

    private Integer id;

    private String groupName;

    private String groupDescription;

    private Date createTime;

    private Date modifyTime;

    private Integer creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription == null ? null : groupDescription.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("groupName", groupName)
                .add("groupDescription", groupDescription)
                .add("createTime", createTime)
                .add("modifyTime", modifyTime)
                .add("creator", creator)
                .toString();
    }
}