package kkAssignments.arrays.Easy;

public class q15 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/matrix-diagonal-sum/
    }
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int sum = 0;
        for(int i = 0 ; i < r;i++){
            for(int j = 0 ; j < c ;j++){
                if(i == j){
                    sum += mat[i][j];
                }
                if(((i+j)==(r-1) || (i+j)==(r-1)) && (i!=j) ){
                    sum += mat[i][j];
                }
            }
        }

        return sum ;
    }
}
