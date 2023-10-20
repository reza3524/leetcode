package string.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                char pop = !stack.isEmpty() ? stack.pop() : '#';
                if (pop != map.get(current)) {
                    return false;
                }
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
}
