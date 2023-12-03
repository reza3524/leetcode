package array.mergesortedarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        merge(new Integer[]{1, 2, 3, 0, 0, 0}, 3, new Integer[]{2, 5, 6}, 3);
    }

    public static void merge(Integer[] nums1, int m, Integer[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m++] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
