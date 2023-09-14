package kkJava.LinearSearchAlgo;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int n = 14;
        System.out.println("is " + n + " present in the given array ? " + isExist(arr, n));
        System.out.println("index of " + n + " is => " + linearSearch(arr, n));
    }
    
    private static boolean isExist(int[] arr, int target){
        if(arr.length == 0) return false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    // If we want to return index

    private static int linearSearch(int[] arr , int target){
        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]) return i;
        }
        return -1;
    }
}
