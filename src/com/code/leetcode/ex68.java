package com.code.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex68 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static List<String> testMain() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> wordList = new ArrayList<>();
        int[] lengths = new int[words.length];
        int[] splitPoints = new int[words.length];
        Arrays.fill(splitPoints, 0);
        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length();
        }
        int nowLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            System.out.println(nowLength += 1 + words[i + 1].length());
            if (nowLength + 1 + words[i + 1].length() > maxWidth) {
                splitPoints[i] = 1;
                nowLength = words[i + 1].length();
                i++;
            } else {
                nowLength += 1 + words[i + 1].length();
            }
        }
        System.out.println(Arrays.toString(splitPoints));
        nowLength = 0;
        int gap = 0;
        for (int i = 0; i < words.length; i++) {
            nowLength += words[i].length();
            if (splitPoints[i] == 0) {
                gap++;
            } else if (splitPoints[i] == 1) {
                StringBuilder temp = new StringBuilder();
                if (gap == 0) {
                    temp.append(" ".repeat(maxWidth - nowLength));
                } else {
                    int blank = (maxWidth - nowLength) / gap;
                    temp.append(" ".repeat(blank));
                }
                wordList.add(String.valueOf(temp));
                gap = 0;
                nowLength = 0;
            }
        }
        return wordList;
    }

}
