package cwJava.array2D;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = takeInput();

        System.out.println("Enter row 1");
        int r1 = in.nextInt();

        System.out.println("Enter row 2");
        int r2 = in.nextInt();

        System.out.println("Enter col 1");
        int c1 = in.nextInt();

        System.out.println("Enter col 2");
        int c2 = in.nextInt();

        int sum = sumRactangle(matrix,r1,r2,c1,c2);
        System.out.println(sum);

        sum = sumRactangle2(matrix,r1,r2,c1,c2);
        System.out.println(sum);
    }

    public static int sumRactangle3(int[][] mat , int r1 , int r2 , int c1 , int c2){
        int sum = 0;
        findPrefixSumColWise(mat);
        sum = mat[r2][c2]-mat[r2][c1-1]-mat[r1-1][c2]+mat[r1-1][c1-1];

        return sum;
    }

    public static int sumRactangle2(int[][] mat , int r1 , int r2 , int c1 , int c2){
        int sum =0 ;
        findPrefixSumRowWise(mat);

        for (int i = r1 ; i <= r2; i++) {
            if(c1 >= 1)
                sum += mat[i][c2]-mat[i][c1-1];
            else
                sum += mat[i][c2];
        }

        return sum;
    }

    public static void findPrefixSumRowWise(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        // traverse horizontally row-wise to find prefix-sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }

    }
    public static void findPrefixSumColWise(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        findPrefixSumRowWise(arr);

        // traverse vertically col-wise to find prefix-sum row & col Wise
        // traverse horizontally row-wise to find prefix-sum
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    public static int sumRactangle(int[][] mat , int r1, int r2 , int c1, int c2){

        int r = mat.length;
        int c = mat[0].length;
        int sum = 0;

        for (int i = r1; i <= r2 ; i++) {
            for (int j = c1; j <= c2 ; j++) {
                sum += mat[i][j];
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
