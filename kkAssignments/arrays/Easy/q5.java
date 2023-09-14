package kkAssignments.arrays.Easy;

public class q5 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/shuffle-the-array/submissions/
    }
    public static int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] ans = new int[l];
        int j = 0;
        for(int i = 0 ; i < n ; i++){

            ans[j] = nums[i];
            j = j+2;
        }
        j = 1;
        for(int i = n ; i < l ;i++){
            ans[j] = nums[i];
            j = j+2;
        }
        return ans;
    }
}
