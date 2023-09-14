package cwJava.array;

import java.util.Arrays;

public class q9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(evenOdd(arr)));
    }
    public static int[] evenOdd(int[] arr){
        int n = arr.length;
        int[] a = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
                if (isEven(arr[i])){
                    a[j] = arr[i];
                    j++;
                }
        }
        for (int i = 0; i < n; i++) {
            if(!isEven(arr[i])){
                a[j] = arr[i];
                j++;
            }
        }
        return a;
    }
    public static boolean isEven(int n ){
        return n%2 == 0;
    }
}
