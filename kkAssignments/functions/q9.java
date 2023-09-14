package kkAssignments.functions;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        /* Write a program to print the factorial of a number by defining a method named 'Factorial'.
         Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        factorial(n);
    }
    public static void factorial(int n){
        int fact = 1;
        if (n == 0 || n == 1){
            System.out.println("factotrial of " + n + " is " + fact);
        }
        for (int i = 2; i <= n  ; i++) {
            fact *= i;
        }
        System.out.println("factotrial of " + n + " is " + fact);
    }
}
