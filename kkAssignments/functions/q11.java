package kkAssignments.functions;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        /*
        Write a function to check if a given triplet is a Pythagorean triplet or not.
        (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        */
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();
        System.out.println("Is this tirplate is Pygthagorean => " + isPythagorean(p,b,h));

    }
    public static boolean isPythagorean(int p , int b , int h){
        return ((h*h) == (p*p) + (b*b) );
    }
}
