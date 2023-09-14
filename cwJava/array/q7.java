package cwJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter number of queries");
        int q = in.nextInt();
        int[] freq = makeFrequencyArray(arr);
        while(q>0){
            System.out.println("Enter number to be searched");
            int x = in.nextInt();
            if(freq[x] >0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }

    }
    public static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
}
