package string.groupanagrams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String string = Arrays.toString(chars);
            if (map.containsKey(string)) {
                map.get(string).add(str);
            } else {
                map.put(string, new ArrayList<>(){{add(str);}});
            }
        }
        return new ArrayList<>(map.values());
    }
}
