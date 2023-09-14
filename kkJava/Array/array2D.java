package kkJava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Row ");
        int r = in.nextInt();
        System.out.println("Enter number of Column");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr){
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
