package kkAssignments.functions;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        /*Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will
         display grades according to the marks entered as below:
        */
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        grad(marks);



    }
    public static void grad(int marks){
        if (marks >= 0 && marks <= 100){
            if (marks <= 40){
                System.out.println("fail");
            } else if (marks > 40 && marks <= 50) {
                System.out.println("DD");
            }else if (marks > 50 && marks <= 60) {
                System.out.println("CD");
            }else if (marks > 60 && marks <= 70) {
                System.out.println("BC");
            }else if (marks > 70 && marks <= 80) {
                System.out.println("BB");
            }else if (marks > 80 && marks <= 90) {
                System.out.println("AB");
            }else {
                System.out.println("AA");
            }
        }
        else{
            System.out.println("You are enter wrong numbers");
        }
    }
}
