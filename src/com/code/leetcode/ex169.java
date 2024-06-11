package com.code.leetcode;

public class ex169 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] nums = {6, 5, 5};
        int vote = 0;
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (vote == 0) {
                flag = nums[i];
            }
            if (nums[i] == flag) {
                vote++;
            } else {
                vote--;
            }
        }
        return flag;
    }
}
