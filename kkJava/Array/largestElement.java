package kkJava.Array;

public class largestElement {
    public static void main(String[] args) {
        int[] nums = {2,4,5,3,6,2,8,4,9,0,6,46,4,654,5,345345,2,567,4,4,67,234345,};
        System.out.println(maxInArr(nums));
    }
    public static int maxInArr(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
