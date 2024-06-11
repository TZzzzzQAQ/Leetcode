package com.code.leetcode;

public class ex80 {
    public static void main(String[] args) {
        System.out.println("flagCount" + testMain());
    }

    public static int testMain() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int count = 0;
        int flag = 20000;
        int flagCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != flag) {
                flagCount = 1;
                flag = nums[i];
                nums[count] = nums[i];
                count++;
            } else if (nums[i] == flag && flagCount < 2) {
                nums[count] = nums[i];
                flagCount++;
                count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return count;
    }
}
