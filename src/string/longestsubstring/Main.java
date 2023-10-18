package string.longestsubstring;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int counter = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            counter = Math.max(counter, right - left + 1);
        }
        return counter;
    }
}
