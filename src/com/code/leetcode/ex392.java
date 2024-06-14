package com.code.leetcode;

public class ex392 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static Boolean testMain() {
        String s = "abc";
        String t = "ahbgdc";
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }
}
