package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] a = testMain();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] testMain() {
        int nums[] = {-7, -3, 2, 3, 11};
        int head = 0;
        int rear = nums.length - 1;
        int ans[] = new int[nums.length];
        for (int i = ans.length - 1; i >= 0; i--) {
            int temp1 = nums[head] * nums[head];
            int temp2 = nums[rear] * nums[rear];
            if (temp1 > temp2) {
                ans[i] = temp1;
                head++;
            } else {
                ans[i] = temp2;
                rear--;
            }
        }
        return ans;
    }
}
