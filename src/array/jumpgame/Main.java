package array.jumpgame;

public class Main {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump(new int[]{2, 3, 0, 1, 4}));
    }

    private static boolean canJump(int[] nums) {
        int boundary = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > boundary) {
                return false;
            }
            boundary = Math.max(boundary, i + nums[i]);
        }
        return true;
    }

    private static int jump(int[] nums) {
        int stepCount = 0;
        int lastJumpMax = 0;
        int currentJumpMax = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentJumpMax = Math.max(currentJumpMax, i + nums[i]);
            if (i == lastJumpMax) {
                stepCount++;
                lastJumpMax = currentJumpMax;
            }
        }
        return stepCount;
    }
}
