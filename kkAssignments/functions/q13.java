package kkAssignments.functions;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        // Write a function that returns the sum of first n natural numbers.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("natural sum is => " + naturalSum(a));
    }
    public static int naturalSum(int n){
        return n*(n+1)/2;
    }
}
