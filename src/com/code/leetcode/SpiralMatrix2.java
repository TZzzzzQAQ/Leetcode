package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class SpiralMatrix2 {
    public static void main(String[] args) {
        testMain();
    }

    public static int[][] testMain() {
        int n = 5;
        int dummy = n;
        int num = 1;
        int[][] ans = new int[n][n];
        for (int i = 0; i <=dummy; i++) {
            for (int j = n - dummy; j < dummy; j++) {
                ans[i][j] = num++;
            }
            for (int j = n - dummy + 1; j < dummy; j++) {
                ans[j][dummy - 1] = num++;
            }
            for (int j = dummy - 2; j >= n - dummy; j--) {
                ans[dummy - 1][j] = num++;
            }
            for (int j = dummy - 2; j > n - dummy; j--) {
                ans[j][n - dummy] = num++;
            }
            dummy--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }
        return ans;
    }
}
