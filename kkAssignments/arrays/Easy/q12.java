package kkAssignments.arrays.Easy;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-highest-altitude/submissions/
    }
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n; i++){
            arr[i] = arr[i-1]+gain[i-1];
        }
        return max(arr);
    }
    public int max(int[] arr){
        int n = arr.length;
        int m = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(m < arr[i]) m = arr[i];
        }
        return m;
    }
}
