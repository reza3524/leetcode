package array.removeduplicatesfromsortedarray;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates2(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    private static int removeDuplicates(int[] nums) {
        int counter = 1;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[counter] = nums[i];
                counter += 1;
            }
        }
        return counter;
    }

    private static int removeDuplicates2(int[] nums) {
        int counter = 1;
        int j = 1;
        for(int i = 1; i < nums.length; ++i) {
            if(nums[i] == nums[i - 1]) {
                if(j < 2) {
                    nums[counter++] = nums[i];
                }
                j++;
            } else {
                j = 1;
                nums[counter++] = nums[i];
            }
        }
        return counter;
    }
}
