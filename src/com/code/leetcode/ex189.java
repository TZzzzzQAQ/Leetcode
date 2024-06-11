package com.code.leetcode;

import java.util.Arrays;

public class ex189 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(testMain()));
    }

    public static int[] testMain() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        k %= nums.length;
        System.out.println(k);
        int[] nums2 = new int[nums.length * 2];
        System.arraycopy(nums, 0, nums2, 0, nums.length);
        System.arraycopy(nums, 0, nums2, nums.length, nums.length);
        System.arraycopy(nums2, nums.length - k, nums, 0, nums.length);
        return nums;
    }
}
