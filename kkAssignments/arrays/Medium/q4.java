package kkAssignments.arrays.Medium;

public class q4 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/set-matrix-zeroes/
    }
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean[][] vis = new boolean[r][c];
        for(int i =0 ; i < r ; i++){
            for(int j = 0 ; j < c ;j++){
                if(matrix[i][j] == 0 && vis[i][j] == false){
                    fill(i,j,matrix,vis);
                }
            }
        }

    }
    public void fill(int x,int y,int[][] mat,boolean[][] vis){
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            if(mat[i][y]!=0){
                mat[i][y]=0;
                // for not disturbing the previous zeroes in matrix
                vis[i][y]=true;
            }
        }
        for(int j=0;j<c;j++){
            if(mat[x][j]!=0){
                mat[x][j]=0;
                vis[x][j]=true;
            }
        }
    }
}
