package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex35 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid-1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return low;
        }
}
