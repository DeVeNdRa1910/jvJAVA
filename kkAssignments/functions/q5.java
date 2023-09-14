package kkAssignments.functions;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        // Define a method that returns the product of two numbers entered by user.
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        System.out.println("product is => " + product(a,b));
    }
    public static float product(float a , float b){
        return a*b;
    }
}
