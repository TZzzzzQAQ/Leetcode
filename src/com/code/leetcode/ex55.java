package com.code.leetcode;

public class ex55 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static Boolean testMain() {
        int[] nums = {2, 0, 0};
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}
