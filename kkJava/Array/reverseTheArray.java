package kkJava.Array;
import java.util.*;

public class reverseTheArray {
    public static void main(String[] args) {
        int[] arr = {1,3,46,76,34,9,8};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start>end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    private static void swap(int[] arr , int i1 , int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] =temp;
    }
}
