package kkJava.Array;

public class targetSum {
    public static void main(String[] args) {
        /* How many number of pair present in array whose sum is equal to target */
        int[] arr = {4,6,3,5,8,2};
        System.out.println(targetSum(arr,7));
    }

    private static int targetSum(int[] arr , int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(target == (arr[i]+arr[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
}
