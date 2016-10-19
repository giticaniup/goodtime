package com.github.api.result;

import com.github.api.code.AjaxCode;
import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 返回结果基础类
 * Created by zhongcy on 2016/10/10.
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -1785307455793036414L;

    /**
     * 错误码，默认为0
     */
    protected int errorCode = AjaxCode.OK;

    /**
     * 错误信息
     */
    protected String errorMsg = "success";

    public Result() {
    }

    public Result(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("errorCode", errorCode)
                .add("errorMsg", errorMsg)
                .toString();
    }
}
