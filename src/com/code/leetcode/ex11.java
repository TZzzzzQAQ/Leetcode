package com.code.leetcode;

public class ex11 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            result = Math.max(result, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
