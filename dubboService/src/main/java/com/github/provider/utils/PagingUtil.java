package com.github.provider.utils;


import com.github.api.result.PagerResult;

/**
 * 查询结果分页工具类
 * Created by zhongcy on 2016/8/19.
 */
public class PagingUtil {

    /**
     * 返回查询结果中的当前页、总页数、总记录数
     */
    public static <T extends PagerResult> void pagingData(T result, Integer count,
                                                          Integer pageSize, Integer pageNumber) {
        result.setTotalCount(count);
        result.setCurrentPage(pageNumber);
        result.setPageCount((int) Math.ceil((double) count / pageSize));
    }
}
