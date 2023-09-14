package kkAssignments.arrays.Easy;

public class q4 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/richest-customer-wealth/
    }
    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++){
            ans[i] = sumArr(accounts[i]);
        }
        return max(ans);
    }
    public static int max(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
    public static int sumArr(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum  += arr[i];
        }
        return sum;
    }
}
