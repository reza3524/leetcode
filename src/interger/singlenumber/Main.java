package interger.singlenumber;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    //Bad Solution
//    public static int singleNumber(int[] nums) {
//        int result = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            boolean isExist = false;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i != j) {
//                    isExist = true;
//                    break;
//                }
//            }
//            if (!isExist) {
//                result = nums[i];
//            }
//        }
//        return result;
//    }
}
