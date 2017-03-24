package com.github.api.entity;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;

/**
 * 报名实体类
 */
public class SignUpInfo implements Serializable {

    private static final long serialVersionUID = 6541242009168290634L;

    /**
     * id
     */
    private String id;

    /**
     * 活动ID
     */
    private String activityId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 名称
     */
    private String name;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 报名日期
     */
    private Date signUpDate;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("activityId", activityId)
                .add("userId", userId)
                .add("name", name)
                .add("phoneNumber", phoneNumber)
                .add("email", email)
                .add("signUpDate", signUpDate)
                .toString();
    }
}
