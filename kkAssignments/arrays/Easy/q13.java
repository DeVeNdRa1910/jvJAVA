package kkAssignments.arrays.Easy;

public class q13 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/flipping-an-image/
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        int[][] arr = reversImage(image);
        for(int i =0 ; i < r ; i++){
            for(int j = 0 ; j < c ;j++){
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] =1;
                }
            }
        }
        return arr;
    }
    public int[][] reversImage(int[][] image ){
        int r = image.length;
        int c = image[0].length;
        int[][] arr = new int[r][c];
        for(int i = 0 ; i < r  ; i++){
            arr[i] = revers(image[i]);
        }

        return arr;
    }
    public int[] revers(int[] arr){
        int n = arr.length;
        int i =0 ;
        int j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
