package com.github.provider.demo; /**
 * Created by zhongcy on 2016/3/9.
 */
import  com.kode.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements  DemoService{
    public void say() {
        Logger logger= LoggerFactory.getLogger(DemoServiceImpl.class);
        System.out.println("hello,dubbo");
    }
}
