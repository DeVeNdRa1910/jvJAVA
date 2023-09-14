package cwJava.array2D;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        printMat(arr);
        System.out.println();
        printSpiralOrder(arr);
    }
    public static void printSpiralOrder(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;
        int totalElements = 0;
        while(totalElements <= r*c){
            //topRow -> leftCol-roightCol  (row will same)
            for(int j = leftCol ; j <= rightCol ; j++){
                System.out.print(mat[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            //roghtCol -> topRow-bottomRow ((col will be same)
            for (int i = topRow; i <= bottomRow ; i++) {
                System.out.print(mat[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            //bottomRow -> rightCol-leftCol (row will be same)
            for(int j = rightCol ; j >= leftCol ; j--){
                System.out.print(mat[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            //leftCol -> bottomRow-topRow (col will be same)
            for (int i = bottomRow; i >= topRow ; i--) {
                System.out.print(mat[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
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
    public static void printMat(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
