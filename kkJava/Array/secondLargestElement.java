package kkJava.Array;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,7,3,8,3,9,40,7,65,8,2};
        System.out.println(secondLargestElement(arr));
    }
    public static  int secondLargestElement(int[] arr){
        int large = largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == large){
                arr[i] = -1;
            }
        }
        int ans = largest(arr);
        return ans;
    }
    public static int largest(int[]  arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
