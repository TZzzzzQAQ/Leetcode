package com.code.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestIncreasingSubsequence {
    public static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(testMain(nums));
        long endTime = System.nanoTime();
        long duration = endTime - startTime; // Duration in nanoseconds
        System.out.println("Execution time: " + duration + " nanos");
    }

    public static int testMain(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(maxLength, max(i, nums));
        }
        return maxLength;
    }

    public static int max(int index, int[] nums) {
        if (index == nums.length - 1) {
            return 1;
        }
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        int maxLength = 0;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                maxLength = Math.max(maxLength, max(i, nums) + 1);
            }
        }
        memo.put(index, maxLength);
        return maxLength;
    }
}
