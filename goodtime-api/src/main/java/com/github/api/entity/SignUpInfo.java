package com.github.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 报名实体类
 */
@Data
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
}
