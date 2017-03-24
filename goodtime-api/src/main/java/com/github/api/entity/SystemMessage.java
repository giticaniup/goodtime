package com.github.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.MoreObjects;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统消息
 * Created by zhongcy on 16-12-5.
 */
public class SystemMessage implements Serializable{

    private static final long serialVersionUID = -394542881421006418L;

    private Integer id;

    private String title;

    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("title", title)
                .add("content", content)
                .add("createTime", createTime)
                .add("modifyTime", modifyTime)
                .toString();
    }
}
