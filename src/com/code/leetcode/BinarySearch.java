package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int target = 9;
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int min = 0;
        int max = nums.length - 1;
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
