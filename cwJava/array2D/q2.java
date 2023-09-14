package cwJava.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        // multiplication of wo matrix
        int[][] m1 = takeInput();
        int[][] m2 = takeInput();

        multiplication(m1 , m2);

    }

    public static void multiplication(int[][] a, int[][] b){
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;
        if(r1 != c2){
            return;
        }

        int[][] m = new int[r1][c2];


        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    m[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        for(int[] arr : m) {
            System.out.println(Arrays.toString(a));
        }

    }

    public static int[][] takeInput(){

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
