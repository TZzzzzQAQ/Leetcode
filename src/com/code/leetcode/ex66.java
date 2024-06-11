package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex66 {
    public static void main(String[] args) {

    }

    public static int[] testMain() {
        int[] digits = {1, 2, 3};
        for (int i = digits.length; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
