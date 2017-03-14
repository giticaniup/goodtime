package com.github.provider.mongo;

import com.github.api.entity.SignUpInfo;

import java.util.List;

/**
 * 报名DAO
 */
public interface SignUpDAO extends BaseOptions<SignUpInfo>{
    /**
     * 所有报名人员
     */
    List<String> listSignUpUsers(String activityId);
}
