package com.code.leetcode;

public class ex209 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int sum = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - j + 1);
                sum -= nums[j];
                j++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
