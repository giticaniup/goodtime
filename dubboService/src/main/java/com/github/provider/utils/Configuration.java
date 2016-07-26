package com.github.provider.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 读取配置文件的值
 * Created by zhongcy on 2016/7/26.
 */
@Service
public class Configuration {

    @Value("${solr.url}")
    private String solrUrl;

    @Value("${solr.table}")
    private String solrTables;

    public String getSolrTables() {
        return solrTables;
    }

    public void setSolrTables(String solrTables) {
        this.solrTables = solrTables;
    }

    public String getSolrUrl() {
        return solrUrl;
    }

    public void setSolrUrl(String solrUrl) {
        this.solrUrl = solrUrl;
    }
}
