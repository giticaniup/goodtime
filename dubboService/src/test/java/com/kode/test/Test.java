package com.kode.test;

import java.io.IOException;
import java.util.Random;

/**
 * Created by zhongcy on 2016/3/9.
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring/spring-dubbo.xml"});
//        context.start();
//        System.out.println("press any key to exit");
//        System.in.read();
//        String s = "0.00*0.0";
//        System.out.println("\"1");
//        String[] totalMoneyArray = s.split("\\*");
//        String s2 = s.replace(".","/");
//        String s1 = s.replaceAll("\\.","/");
//        System.out.println("replaceAll:"+s1);
//        System.out.println("replace:"+s2);
//        if (totalMoneyArray.length == 2 && totalMoneyArray[1].length() > 2) {
//            String opportunityTotalMoney = Joiner.on(".").join(totalMoneyArray[0], totalMoneyArray[1]
//                    .substring(0, 2));
//            System.out.println("opp:"+opportunityTotalMoney);
//        }
//        System.out.println(s.indexOf("."));
//        System.out.println(1<4-2);
//        System.out.println(s.substring(0,s.length()-2));
        Random random = new Random();
        for (int i = 0; i < 115; i++) {
            String s = "1";
            for (int j = 0; j < 10; j++) {
                s = s + random.nextInt(9);
            }
            System.out.println(s);
        }
    }
}
