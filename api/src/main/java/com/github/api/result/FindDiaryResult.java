package com.github.api.result;

import com.github.api.entity.UserDiary;
import com.github.api.enums.UserCodeEnums;
import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * 获取日志结果
 * Created by zhongcy on 2016/7/13.
 */
public class FindDiaryResult extends BaseResult{
    private static final long serialVersionUID = 3550524151324454214L;

    private List<UserDiary> userDiaries;

    private int totalCount;

    private int pageCount;

    public FindDiaryResult() {
    }

    public FindDiaryResult(UserCodeEnums userCodeEnums) {
        this.errorCode = userCodeEnums.getErrorCode();
        this.errorMsg = userCodeEnums.getErrorMsg();
    }

    public List<UserDiary> getUserDiaries() {
        return userDiaries;
    }

    public void setUserDiaries(List<UserDiary> userDiaries) {
        this.userDiaries = userDiaries;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userDiaries", userDiaries)
                .add("totalCount", totalCount)
                .add("pageCount", pageCount)
                .add("errorCode",errorCode)
                .add("errorMsg",errorMsg)
                .toString();
    }
}


