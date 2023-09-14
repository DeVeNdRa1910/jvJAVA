package kkAssignments.functions;

import java.util.Scanner;

public class q12 {
    /*  Write a function that returns all prime numbers between two given numbers. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        printPrime(a,b);
    }
    public static void printPrime(int a , int b){
        for (int i = a ; i <= b ; i++) {
            if(isPrime2(i)) System.out.print(i + " ");
        }
    }
    public static boolean isPrime2(int n){
        if(n == 1 || n == 0) return false;
        if (n == 2 || n == 3){
            return true;
        }
        for (int i = 4; i*i < n ; i++) {
            if (n%i == 0) return false;
        }

        return true;
    }
}
