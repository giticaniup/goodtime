package com.github.api.enums;

/**
 * 活动状态枚举
 * Created by zhongcy on 2017-02-25.
 */
public enum ActivityStatusEnum {
    NOT_STARTED(0, "未开始"),
    IN_PROGRESS(1, "进行中"),
    HAS_FINISHED(2, "已结束"),
    HAS_CANCELED(3, "已取消"),;
    int status;
    String describe;

    ActivityStatusEnum(int status, String describe) {
        this.status = status;
        this.describe = describe;
    }

    public int getStatus() {
        return status;
    }

    public String getDescribe() {
        return describe;
    }
}
