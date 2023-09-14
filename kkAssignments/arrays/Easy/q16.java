package kkAssignments.arrays.Easy;

public class q16 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    }
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i =0;i<n;i++){
            if(numOfDigit(nums[i])%2 == 0) ans++;
        }
        return ans;
    }
    public int numOfDigit(int n){
        return (int)(Math.log10(n))+1;
    }
}
