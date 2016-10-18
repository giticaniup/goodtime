package com.github.api.result;

import com.google.common.base.MoreObjects;

/**
 * 返回结果定义
 * Created by zhongcy on 2016/7/13.
 */
public class BaseResult<T> extends Result {
    private static final long serialVersionUID = -7083472192798914723L;

    /**
     * 结果信息
     */
    protected T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("super", super.toString())
                .add("data", data)
                .toString();
    }
}
