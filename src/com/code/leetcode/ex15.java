package com.code.leetcode;

import java.util.*;

public class ex15 {
    public static void main(String[] args) {
        System.out.println(testSum().toString());
    }

    public static List<List<Integer>> testSum() {
        int[] nums = {0, 0, 0, 0};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>(res);
        res = new ArrayList<>(set);
        return res;
    }
}
