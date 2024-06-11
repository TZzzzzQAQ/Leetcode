package com.code.leetcode;

public class ex6 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static String testMain() {
        int numRows = 1;
        String s = "AB";
        StringBuilder result = new StringBuilder();
        int left = (numRows - 1) * 2;
        int right = 0;
        int index = 0;
        if (numRows == 1 || numRows > s.length()) {
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            index = i;
            while (index < s.length()) {
                System.out.println(left);
                System.out.println(right);
                if (left != 0) {
                    result.append(s.charAt(index));
                    index += left;
                }
                if (right != 0 && index < s.length()) {
                    result.append(s.charAt(index));
                    index += right;
                }
            }
            right += 2;
            left -= 2;
        }
        return result.toString();
    }
}
