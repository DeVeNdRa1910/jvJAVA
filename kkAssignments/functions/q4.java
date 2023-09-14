package kkAssignments.functions;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        // Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = sum(a,b);
        System.out.println(sum);
    }
    public static int sum(int a , int b){
        return a+b;
    }

}
