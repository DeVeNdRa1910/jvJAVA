package kkJava.LinearSearchAlgo;

public class Q4 {
    // Find the number of numbers that contain even digit
    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,98,1};
        int ans = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(numOfDigit(arr[i])%2 == 0) ans++;
        }
        System.out.println(ans);
    }
    private static int numOfDigit(int n ){
        int ans = 0;
        while(n>0){
            n = n/10;
            ans++;
        }
        return ans;
        // or
        // return (int)(Math.log10(num))+1 
    }
    
}
