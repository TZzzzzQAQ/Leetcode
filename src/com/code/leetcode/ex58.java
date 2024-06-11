package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex58 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        String s = "   fly me   to   the moon  ";
        String[] splitString = s.split("\\s+");
        return splitString[splitString.length - 1].length();
    }
}
