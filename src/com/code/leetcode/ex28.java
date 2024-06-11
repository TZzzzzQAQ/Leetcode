package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex28 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        String haystack = "abc", needle = "c";
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String temp = haystack.substring(i, needle.length() + i);
            System.out.println(temp);
            if (temp.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
