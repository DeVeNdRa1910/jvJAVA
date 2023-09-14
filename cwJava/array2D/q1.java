package cwJava.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // addition of two matrix
        int[][] mat1 = takeInput();
        int[][] mat2 = takeInput();
        int [][] matSum = addition(mat1 , mat2);

        for(int[] a : matSum) {
            System.out.println(Arrays.toString(a));
        }

    }

    public static int[][] addition(int[][] a , int[][] b){
        int r = a.length;
        int c = a[0].length;

        int[][] sum = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }

        return sum;
    }
    public static int[][] takeInput(){

        System.out.println("size of both matrix should be same ");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int r = in.nextInt();
        System.out.println("Enter number of column ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
}
