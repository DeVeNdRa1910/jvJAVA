package kkJava.Array;

import java.util.Arrays;

public class array1D {
    public static void main(String[] args) {
        // taking input using for loop

        /*
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
         */
        int[] arr = {23,46,7,98,4,6,342,35,57,5456,457,54564,774};

        /*
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}