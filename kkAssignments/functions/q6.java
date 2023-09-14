package kkAssignments.functions;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();

        System.out.println("area of the circle => " + area(r) + " circumference of the circle => " +circumference(r));
    }

    public static float area(float r ){
        return 3.14f*r*r;
    }
    public static float circumference(float r){
        return 2f*3.14f*r;
    }


}
