package com.code.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class Climbstairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairs(n, map);
    }

    private static int climbStairs(int n, Map<Integer, Integer> map) {
        if (n == 1) {
            return 1;
        } else if (n == 2)
            return 2;
        if (!map.containsKey(n)) {
            map.put(n, climbStairs(n - 1, map) + climbStairs(n - 2, map));
        }
        return map.get(n);
    }
}
