package cwJava.array2D;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int[][] arr = takeInput();

        int[][] tparr = tpose(arr);

        for(int[] a : tparr){
            System.out.println(Arrays.toString(a));
        }
    }
    // thankyu HANUMAN ji for my keyboard ;
    // Bolo siyapti RAMchandra ki jay ;
    // BOLO pawan putra HANUMAN ki jay ;

    public static int[][] tpose(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        int[][] tp = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tp[i][j] = arr[j][i];
            }
        }

        return tp;
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
