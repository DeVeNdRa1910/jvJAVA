package kkAssignments.arrays.Medium;

public class q2 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/spiral-matrix-ii/
    }
    public int[][] generateMatrix(int n) {
        int c = 0;
        int[][] arr = new int[n][n];
        int tr = 0 ;
        int br = n-1;
        int lc =0;
        int rc = n-1;
        int j = 1;
        while(c <= n*n){

            for(int i = lc ; i <= rc ; i++){
                arr[tr][i] = j;
                j++;
                c++;
            }
            tr++;

            for(int i = tr ; i <= br ; i++){
                arr[i][lc] = j;
                j++;
                c++;
            }
            rc--;

            for(int i = rc ; i >= lc ; i--){
                arr[br][i] = j;
                j++;
                c++;
            }
            br--;

            for(int i = br ; i >= tr ; i--){
                arr[i][lc] = j;
                j++;
                c++;
            }
            lc++;


        }
        return arr;
    }
}
