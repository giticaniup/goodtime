package com.kode.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test2 {
    public static void main(String[] s) {
        Map<String, Boolean> whoLetDogsOut = new ConcurrentHashMap<>();
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfAbsent("snoop", k -> f(k));
        whoLetDogsOut.computeIfPresent("snoop", (k,v) -> f(k));
    }
    static boolean f(String s) {
        System.out.println("creating a value for \""+s+'"');
        return s.isEmpty();
    }
}