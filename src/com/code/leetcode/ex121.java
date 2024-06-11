package com.code.leetcode;

public class ex121 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= buyPrice) {
                buyPrice = prices[i];
            } else {
                profit = Math.max(prices[i] - buyPrice, profit);
            }
        }
        return profit;
    }
}
