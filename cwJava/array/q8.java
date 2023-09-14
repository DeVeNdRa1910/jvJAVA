package cwJava.array;
import java.util.*;

public class q8 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
    }
    public static int[] sort(int[] arr){
        int z = 0; // number of zeros
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                z++;
        }
        for (int i = 0; i < z; i++) {
            arr[i] =0;
        }
        for (int i = z; i < n; i++) {
            arr[i] = 1;
        }
        return arr;
    }
    public static int[] sort2(int[] arr){
        int n= arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 0) left++;
            if (arr[right] == 1 ) right--;
        }
        return arr;
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[j] = arr[i];
        arr[j] = temp;
    }

}
