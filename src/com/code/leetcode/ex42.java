package com.code.leetcode;

public class ex42 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int temp = 0;
        int result = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            temp = Math.max(height[i], temp);
            right[i] = temp;
        }
        temp = 0;
        for (int i = 0; i < height.length; i++) {
            temp = Math.max(height[i], temp);
            left[i] = temp;
        }
        for (int i = 0; i < height.length; i++) {
            temp = Math.min(left[i], right[i]);
            result += temp > height[i] ? temp - height[i] : 0;
        }
        return result;
    }
}
