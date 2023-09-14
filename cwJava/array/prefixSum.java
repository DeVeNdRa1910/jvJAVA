package cwJava.array;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(prefSum(arr)));
        System.out.println(Arrays.toString(prefSum2(arr)));
    }
    public static int[] prefSum(int[] arr){
        int n = arr.length;
        int[]  pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    public static int[] prefSum2(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
}
