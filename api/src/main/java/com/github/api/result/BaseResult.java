package com.github.api.result;

import com.github.api.enums.UserCodeEnums;
import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 返回结果定义
 * Created by zhongcy on 2016/7/13.
 */
public class BaseResult implements Serializable {
    private static final long serialVersionUID = -7083472192798914723L;

    protected Integer errorCode;

    protected String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public BaseResult() {
    }

    public BaseResult(UserCodeEnums userCodeEnums) {
        this.errorCode = userCodeEnums.getErrorCode();
        this.errorMsg = userCodeEnums.getErrorMsg();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("errorCode", errorCode)
                .add("errorMsg", errorMsg)
                .toString();
    }
}
