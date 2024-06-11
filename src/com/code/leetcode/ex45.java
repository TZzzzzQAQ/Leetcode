package com.code.leetcode;

public class ex45 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] nums = {2, 3, 1};
        int count = 0;
        int endPos = 0;
        int maxPos = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPos = Math.max(maxPos, nums[i] + i);
            if (i == endPos) {
                endPos = maxPos;
                count++;
            }
        }
        return count;
    }
}
