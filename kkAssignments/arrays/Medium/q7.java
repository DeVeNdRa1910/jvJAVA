package kkAssignments.arrays.Medium;

public class q7 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/jump-game/
    }
    public static boolean canJump(int[] nums) {
        // first we condider the final position to be the last index

        int finalPosition = nums.length - 1;

        // Start iterating from the second last index

        for (int idx = nums.length - 2; idx >= 0; idx--) {

            // If we can reach the final position from this index, update the final position flag
            if (idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }

        // If we reach the first index, then we can
        // make the jump possible
        //it returns true is the finalposition=0
        return finalPosition == 0;
    }

}
