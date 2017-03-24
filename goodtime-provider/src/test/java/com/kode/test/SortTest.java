package com.kode.test;

/**
 * 插排
 * Created by zhongcy on 2016/7/21.
 */
public class SortTest {
    @org.junit.Test
    public void insertSort() {
        int[] arr = {4, 1, 6, 7, 2};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @org.junit.Test
    public void insertSortTest2() {
        int[] arr = {4, 1, 6, 7, 2};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
