package string.reverseword;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("  a good   example  ")); //result --> "example good a"
    }

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                int index = s.indexOf(' ', i);
                if (index < 0) {
                    index = s.length();
                }
                String substring = s.substring(i, index);
                stack.push(substring);
                i = index;
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
            if (!stack.isEmpty()) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
