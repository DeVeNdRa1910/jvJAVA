package cwJava.array;

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        int[] rev = revers(arr);
        System.out.println(Arrays.toString(rev));
        int[] rev2 = revers2(arr);
        System.out.println(Arrays.toString(rev2));
    }
    public static int[] revers(int[] arr){
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) {
            rev[i] = arr[n-1-i];
        }
        return rev;
    }
    public static int[] revers2(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return arr;
    }
}
