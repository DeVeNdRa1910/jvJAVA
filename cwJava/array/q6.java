package cwJava.array;

import java.util.Arrays;

public class q6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        System.out.println(Arrays.toString(arr));
        int[] rev = rotatArray(arr , 1243);
        System.out.println(Arrays.toString(rev));
        int[] rev2 = rotatarr(arr,1234);
        System.out.println(Arrays.toString(rev2));

    }
    public static int[] rotatArray(int[] arr, int k){
        // Rotat array k times
        int n= arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            ans[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n-k; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    public static int[] rotatarr(int[] arr , int k){
        int n = arr.length;
        k=k%n;
        int n1 = 0;
        int n2 = n-k;
        reverse(arr,n1,n2-1);
        reverse(arr,n2,n-1);
        reverse(arr,0,n-1);
        return arr;

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
