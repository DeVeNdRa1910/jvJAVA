package kkAssignments.functions;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        /*  Write a function to find if a number is a palindrome or not. Take number as parameter.
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPalindrom(n));
    }

    public static boolean isPalindrom(int n){
        int dup = n;
        int rev = 0;
        while(n>0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev == dup;
    }

}
