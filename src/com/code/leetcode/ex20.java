package com.code.leetcode;

import java.util.Stack;

/**
 * @author Zhiqian Tan
 * @version 1.0
 */
public class ex20 {
    public static void main(String[] args) {
        System.out.println(testMain());
    }

    public static Boolean testMain() {
        String str = "((";
        Stack<Character> stack = new Stack<>();
        if (str.length() % 2 != 0) {
            return false;
        }
        for (Character character : str.toCharArray()) {
            if (character == '{') {
                stack.push('}');
            } else if (character == '[') {
                stack.push(']');
            } else if (character == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != character) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
