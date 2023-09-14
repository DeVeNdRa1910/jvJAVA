package cwJava.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class lec_1 {
    public static void main(String[] args) {
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

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
