package com.github.provider.search;

import com.github.provider.utils.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**定时任务做数据索引
 * Created by zhongcy on 2016/7/26.
 */

@Component("dataIndex")
public class DataIndex {
    private static final Logger logger = LoggerFactory.getLogger(DataIndex.class);

    @Autowired
    private Configuration configuration;

    @Scheduled(cron="0 0/1 * * * ?")
    public void indexData(){
        System.out.println("test");
    }

}
