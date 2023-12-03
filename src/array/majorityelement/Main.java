package array.majorityelement;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2, 3, 4, 4}));
    }

    //Better solution
    private static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

//    private static int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.putIfAbsent(nums[i], 0);
//            map.computeIfPresent(nums[i], (key, value) -> value + 1);
//        }
//        Integer maxValue = Collections.max(map.values());
//        AtomicInteger maxKey = new AtomicInteger();
//        map.forEach((key, value) -> {
//            if (value == maxValue) {
//                maxKey.set(key);
//            }
//        });
//        return maxKey.get();
//    }
}
