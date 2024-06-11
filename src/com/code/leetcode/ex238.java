package com.code.leetcode;

import java.util.Arrays;

public class ex238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(testMain()));
    }

    public static int[] testMain() {
        int[] nums = {1, 2, 3, 4};
        int length = nums.length;
        int current = 1;
        int[] result = new int[length];
        Arrays.fill(result, 1);
        for (int i = 0; i < length; i++) {
            result[i] *= current;
            current *= nums[i];
        }
        current = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= current;
            current *= nums[i];
        }
        return result;
    }
}
