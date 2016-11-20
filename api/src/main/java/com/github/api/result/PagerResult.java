package com.github.api.result;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * 结果中包含分页的信息
 * Created by zhongcy on 2016/10/10.
 */
public class PagerResult<T> implements Serializable {

    private static final long serialVersionUID = 4886820386765508911L;

    private T data;

    private Integer pageCount;

    private Integer totalCount;

    private Integer currentPage;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("data", data)
                .add("pageCount", pageCount)
                .add("totalCount", totalCount)
                .add("currentPage", currentPage)
                .toString();
    }
}
