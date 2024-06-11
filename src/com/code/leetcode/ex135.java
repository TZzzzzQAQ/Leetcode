package com.code.leetcode;

public class ex135 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] ratings = {1, 3, 2, 2, 1};
        int last = 0;
        int next = 0;
        int peak = 0;
        int result = ratings.length;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] > ratings[i]) {
                next++;
                last = 0;
                result += next - (peak >= next ? 1 : 0);
            } else if (ratings[i - 1] == ratings[i]) {
                last = 0;
                peak = 0;
                next = 0;
            } else {
                last++;
                next = 0;
                peak = last;
                result += last;
            }
            System.out.println(result);
        }
        return result;
    }
}
