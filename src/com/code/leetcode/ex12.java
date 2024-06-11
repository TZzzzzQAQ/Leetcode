package com.code.leetcode;


public class ex12 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static String testMain() {
        int num = 3749;
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder result = new StringBuilder();
        int i = 12;
        while (num >= 1) {
            System.out.println(num % arr[i]);
            if (num - arr[i] < 0) {
                i--;
            } else {
                result.append(symbol[i]);
                num -= arr[i];
            }
        }
        return result.toString();
    }
}
