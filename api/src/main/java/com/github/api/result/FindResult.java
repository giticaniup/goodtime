package com.github.api.result;

import com.google.common.base.MoreObjects;

/**
 * 结果中包含分页的信息
 * Created by zhongcy on 2016/10/10.
 */
public class FindResult<T> extends BaseResult<T> {

    private static final long serialVersionUID = 4886820386765508911L;

    private Integer pageCount;

    private Integer totalCount;

    private Integer currentPage;

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
                .add("super", super.toString())
                .add("pageCount", pageCount)
                .add("totalCount", totalCount)
                .add("currentPage", currentPage)
                .toString();
    }
}
