package array.removeElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    private static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index += 1;
            }
        }
        return index;
    }
}
