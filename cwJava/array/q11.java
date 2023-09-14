package cwJava.array;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Element");
        for (int i = 1; i <= n ; i++) {
            arr[i] = in.nextInt();
        }

        int[] pref = makePrefixSum(arr);
        System.out.println("Enter number of queries to be asked");
        int q = in.nextInt();

        while(q>0){
            System.out.println("Enter Range");
            int l = in.nextInt();
            int r = in.nextInt();

            int ans = pref[r]-pref[l-1];
            System.out.println("SUM IS " + ans);
            q--;
        }
    }
    public static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }

}
