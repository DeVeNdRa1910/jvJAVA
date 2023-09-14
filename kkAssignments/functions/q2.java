package kkAssignments.functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        // Define a program to find out whether a given number is even or odd.
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if (isEvevn(n)){
            System.out.println("Number is EVEN");
        }else {
            System.out.println("Number is ODD");
        }
    }
    public static boolean isEvevn(int n){
        return n%2 == 0;
    }
}
