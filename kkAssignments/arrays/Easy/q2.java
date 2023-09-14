package kkAssignments.arrays.Easy;

public class q2 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/concatenation-of-array/submissions/
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0 ; i < 2*n ; i++){
            ans[i] = nums[i%n];
        }
        return ans;
    }
}
