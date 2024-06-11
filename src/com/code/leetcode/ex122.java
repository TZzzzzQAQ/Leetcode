package com.code.leetcode;

import javax.swing.*;

public class ex122 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] prices = {7, 1, 5, 3, 6, 4, 2, 8, 9, 1};
        int right = 1;
        int left = 0;
        int profit = 0;
        while (right < prices.length) {
            if (prices[right] - prices[left] > 0) {
                profit += prices[right] - prices[left];
            }
            left = right;
            right++;
        }
        return profit;
    }
}
