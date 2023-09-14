package kkAssignments.arrays.Medium;

public class q5 {
    public static void main(String[] args) {

    }

    // time is O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int product = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                product *= nums[i];
            else
                count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && count <= 1)
                nums[i] = product;
            else if (nums[i] != 0 && count == 0)
                nums[i] = product / nums[i];
            else
                nums[i] = 0;
        }
        return nums;
    }





    // time is O(n^2)
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = product(nums , i);
        }
        return arr;
    }
    public int product(int[] arr , int t){
        int n = arr.length;
        int ans = 1;
        for(int i = 0 ; i<n ;i++){
            if(i != t){
                ans = ans*arr[i];
            }
        }
        return ans;
    }
}
