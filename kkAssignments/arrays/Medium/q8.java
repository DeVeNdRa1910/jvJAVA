package kkAssignments.arrays.Medium;

public class q8 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/rotate-array/
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int n1 = 0;
        int n2 = n-k;
        reverse(nums,n1,n2-1);
        reverse(nums,n2,n-1);
        reverse(nums,0,n-1);

    }
    public static void reverse(int[] arr , int n1 ,int n2){
        int i = n1;
        int j = n2;
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
