package string.longestvalidparentheses;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()(((()))"));
    }

    public static int longestValidParentheses(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}
