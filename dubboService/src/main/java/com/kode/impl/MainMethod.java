package com.kode.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zhongcy on 2016/3/9.
 */
public class MainMethod {
    private static Logger logger= LoggerFactory.getLogger(MainMethod.class);
    public static  void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo.xml");
        context.start();
        try {
            System.out.println("context is inited");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
