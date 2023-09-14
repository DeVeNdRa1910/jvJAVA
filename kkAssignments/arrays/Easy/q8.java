package kkAssignments.arrays.Easy;

public class q8 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans  = new int[n];
        for(int i = 0 ; i < n ; i++){
            ans[i] = smaller(nums , nums[i]);
        }
        return ans;
    }
    public int smaller(int[] arr , int t){
        int n  = arr.length;
        int num = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < t) num++;
        }
        return num;
    }
}
