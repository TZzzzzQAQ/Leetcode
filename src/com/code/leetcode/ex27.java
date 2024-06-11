package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex27 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 3;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return count;
    }
}
