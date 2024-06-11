package com.code.leetcode;

public class ex151 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static String testMain() {
        String s = "a good   example";
        String[] splitString = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = splitString.length - 1; i >= 0; i--) {
            result.append(splitString[i]).append(" ");
        }
        return result.toString().trim();
    }
}
