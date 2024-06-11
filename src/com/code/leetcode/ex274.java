package com.code.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class ex274 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int[] citations = {3, 0, 6, 1, 5};
        int count = 0;
        Integer[] numbers = new Integer[citations.length];
        for (int i = 0; i < citations.length; i++) {
            numbers[i] = citations[i];
        }
        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i) {
                count++;
            }
        }
        return count;
    }
}
