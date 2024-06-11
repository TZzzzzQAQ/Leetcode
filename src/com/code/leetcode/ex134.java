package com.code.leetcode;

public class ex134 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};
        int count = 0;
        int total = 0;
        int result = 0;
        for (int i = 0; i < gas.length; i++) {
            count += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }
        if (count < 0) {
            return -1;
        }
        return result;
    }
}
