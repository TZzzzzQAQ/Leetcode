package com.code.leetcode;

import java.util.Arrays;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex14 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static String testMain() {
        String[] strs = {"flower", "flow", "flight"};
        Arrays.sort(strs);
        int index = 0;
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return s1.substring(0, index);
    }

}
