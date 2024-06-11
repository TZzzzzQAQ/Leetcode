package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class Sqrtx {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int x = 8;
        if (x == 0) {
            return 0;
        }
        int low = 1;
        int high = x ;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == x / mid) {
                return mid;
            }
            if (mid < x / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
