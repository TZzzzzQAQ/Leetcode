package com.code.leetcode;

import java.util.HashMap;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static int testMain() {
        int target = 213;
        int[] nums = {12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int head = 0;//滑动窗口头指针
        int rear = 0;//尾指针
        int sum = 0;
        int minAns = 2 << 16;//比较大的整数
        while (rear < nums.length) {//只要滑动窗口尾指针不走出数组就一直循环，最后记得补上尾指针后移++
            sum += nums[rear];//随便加
            while (sum >= target) {//当超出范围开始缩小滑动窗口大小
                minAns = Math.min(minAns, rear - head + 1);//第一次看先无视这句代码，这句话用
                // 来处理如果数组很长的情况下如何确保我们错过了最短的窗口，用一个ans值来保存
                sum -= nums[head];//窗口被缩小减去最先入窗口的数
                head++;//窗口头指针移动，然后看上上面那句
            }
            rear++;
        }
        if (minAns == 2 << 16) {
            minAns = 0;//用于处理加满了也没有到target的情况
        }
        return minAns;
    }
}
