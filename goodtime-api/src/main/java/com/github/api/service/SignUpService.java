package com.github.api.service;

import com.github.api.entity.SignUpInfo;

import java.util.List;

/**
 * 报名Service
 */
public interface SignUpService {

    /**
     * 报名
     */
    void signUpActivity(SignUpInfo info);

    /**
     * 获取报名人员信息
     */
    List<String> listSignUpUsers(String activityId);
}
