package com.code.leetcode;

public class ex125 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static Boolean testMain() {
        String s = "0P";
        String temp = s.toUpperCase();
        int first = 0;
        int last = s.length() - 1;
        while (first <= last) {
            if (!((temp.charAt(first) >= 'A' && temp.charAt(first) <= 'Z') || (temp.charAt(first) >= '0' && temp.charAt(first) <= '9'))) {
                first++;
                continue;
            }
            if (!((temp.charAt(last) >= 'A' && temp.charAt(last) <= 'Z') || (temp.charAt(last) >= '0' && temp.charAt(last) <= '9'))) {
                last--;
                continue;
            }

            if (temp.charAt(first) == temp.charAt(last)) {
                first++;
                last--;
            } else {
                return false;
            }
        }
        return true;
    }
}
