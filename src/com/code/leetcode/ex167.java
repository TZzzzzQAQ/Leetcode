package com.code.leetcode;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class ex167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(testMain()));
    }

    public static int[] testMain() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int i = 0;
        for (int j = numbers.length - 1; j > 0; j--) {
            while (i < j) {
                int temp = target - numbers[j];
                if (temp == numbers[i]) {
                    return new int[]{i + 1, j + 1};
                } else {
                    if (temp > numbers[i]) {
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
        return null;
    }
}
