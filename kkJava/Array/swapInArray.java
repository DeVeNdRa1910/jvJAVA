package kkJava.Array;

import java.util.Arrays;

public class swapInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,5,7,4};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr , int i1 , int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] =temp;
    }
    
}
