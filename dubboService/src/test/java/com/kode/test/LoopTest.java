package com.kode.test;

/**
 * Created by zhongcy on 2016/9/14.
 */
public class LoopTest {
    public static void main(String[] args) {
        long begin;
        long end;
        int[][] a = new int[10000][10];
        begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = 1;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("first:" + (end - begin));


        int[][] b = new int[10][10000];
        begin = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10000; j++) {
                b[i][j] = 1;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("second:" + (end - begin));



    }
}
