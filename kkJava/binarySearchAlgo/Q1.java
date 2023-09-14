package kkJava.binarySearchAlgo;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,14,16,28,56};
        System.out.println("Is 14 present in the array "+search(arr, 14));
        System.out.println("Ceiling of 15 present in the array "+ arr[ceiling(arr, 15)]);
        System.out.println("Floor of 15 present in the array "+ arr[floor(arr, 15)]);
    }
    private static boolean search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{ // target < arr[mid]
                end = mid-1;
            }
        }
        return false;
    }

    public static int ceiling(int[] arr , int tgt){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e-s)/2 ;
            if (arr[m] > tgt){
                e = m-1;
            } else if (arr[m] < tgt){
                s = m+1;
            } else {
                return m;
            }
        }
        return s;
    }

    public static int floor(int[] arr , int tgt){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e-s)/2 ;
            if (arr[m] > tgt){
                e = m-1;
            } else if (arr[m] < tgt){
                s = m+1;
            } else {
                return m;
            }
        }
        return e;
    }
}
