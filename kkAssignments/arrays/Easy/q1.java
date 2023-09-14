package kkAssignments.arrays.Easy;

public class q1 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/build-array-from-permutation/description/
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int  i = 0 ; i < n ; i++){
            ans[i]  = nums[nums[i]];
        }
        return ans;
    }
}
