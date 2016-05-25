package com.kode.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * Created by zhongcy on 2016/3/9.
 */
public class Test {
    public static void  main(String[] args ) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring/spring-dubbo.xml"});
        context.start();
        System.out.println("press any key to exit");
        System.in.read();
    }
}
