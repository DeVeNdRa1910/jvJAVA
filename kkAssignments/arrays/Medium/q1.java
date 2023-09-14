package kkAssignments.arrays.Medium;

public class q1 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/spiral-matrix/
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

}
