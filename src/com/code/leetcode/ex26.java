package com.code.leetcode;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex26 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = 0;
        int flag = 200;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != flag) {
                flag = num[i];
                int temp = num[i];
                num[i] = num[count];
                num[count] = temp;
                count++;
            }
            System.out.println("flag:" + flag);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        return count;
    }
}
