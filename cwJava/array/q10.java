package cwJava.array;

import java.util.Arrays;

public class q10 {
    public static void main(String[] args) {
        int[] arr = {-10,-3,-2,1,4,5};
        System.out.println(Arrays.toString(arr));
        int[] sqrSort = sqrSort(arr);

        System.out.println(Arrays.toString(sqrSort));

    }
    public static int[] sqrSort(int[] arr){
        int[] sqr = arrSqr(arr);
        int n = arr.length;
        int last = n-1;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            last = n-1-i;
            maxi = getMaxIndex(arr,0,last);
            swap(sqr , last , maxi);
        }
        return sqr;
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int getMaxIndex(int[] arr , int s , int e){
        int maxi = 0;
        int n = arr.length;
        for (int i = s; i <= e; i++) {
            if(arr[maxi] < arr[i]) maxi = i;
        }
        return maxi;
    }
    public static int[] arrSqr(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }
}
