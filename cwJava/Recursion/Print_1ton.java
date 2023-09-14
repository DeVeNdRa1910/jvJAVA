package cwJava.Recursion;

import java.util.Scanner;

public class Print_1ton {
    public static void main(String[] args) {
        // print then all natural number from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
    public static void print(int n){
        if (n == 0) return;
        print(n-1);
        System.out.print( n  + " ");
    }
}
