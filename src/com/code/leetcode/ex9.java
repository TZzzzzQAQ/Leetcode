package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex9 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static Boolean testMain() {
        int x = 10;
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        StringBuilder sb2 = new StringBuilder(sb.reverse());
        if (sb.compareTo(sb2)==0){
            return true;
        }
        return false;
    }
}
