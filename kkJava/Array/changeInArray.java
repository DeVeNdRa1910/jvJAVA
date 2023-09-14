package kkJava.Array;

import java.util.*;

public class changeInArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(Arrays.toString(nums));
        change(nums);

    }
    public static void change(int[] arr){
        arr[0] = 12999;
        System.out.println(Arrays.toString(arr));
    }
}
