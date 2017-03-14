package com.github.provider.constants;

/**
 * 活动状态
 */
public enum ActivityStatus {

    NOT_START(0, "未开始"),

    IN_PROGRESS(1, "进行中"),

    ALREADY_OVER(2, "已结束"),

    ALREADY_CANCELED(3, "已取消");

    ActivityStatus(int status, String describe) {
        this.status = status;
        this.describe = describe;
    }

    private int status;
    private String describe;

    public int getStatus() {
        return status;
    }

    public String getDescribe() {
        return describe;
    }
}
