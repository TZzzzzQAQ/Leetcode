package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex67 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static String testMain() {
        String a = "100";
        String b = "110010";

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int length1 = a.length() - 1;
        int length2 = b.length() - 1;
        while (length1 >= 0 || length2 >= 0 || carry == 1) {
            if (length1 >= 0) {
                carry += a.charAt(length1--) - '0';
            }
            if (length2 >= 0) {
                carry += b.charAt(length2--) - '0';
            }
            sb.append(carry % 2);
            carry = carry / 2;
        }
        return sb.reverse().toString();
    }
}
