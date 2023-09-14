package kkAssignments.arrays.Easy;

public class q3 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/running-sum-of-1d-array/
    }
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[]  ans = new int[n];
        ans[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            ans[i] = nums[i]+ans[i-1];
        }
        return ans;
    }
    public static int[] runningSum2(int[] nums) {
        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
