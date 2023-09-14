package kkAssignments.arrays.Easy;

public class q7 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/number-of-good-pairs/submissions/
    }
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(nums[i] == nums[j]) ans++;
            }
        }
        return ans;
    }
}
