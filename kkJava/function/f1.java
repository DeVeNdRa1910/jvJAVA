package kkJava.function;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        swap(a,b);
        System.out.println(a + " , " +b);
        Scanner in = new Scanner(System.in);
        greeet();

        System.out.println("Enter first number");
        int n1 = in.nextInt();
        System.out.println("Enter second number");
        int n2 = in.nextInt();
        if(sum(n1,n2)/2 == 0){
            System.out.println(" sum Even ");
        }
        if (sum(n1, n2)/2!=0) {
            System.out.println("sum is ODD");
        }

    }
    public static int sum(int num1 , int num2){

        return num1+num2;
    }

    public static void greeet(){
        System.out.println("Hello Boss, WELCOME Back System will get ready for you");
    }

    public static void swap(int c , int  d){
        int v = c;
        c=d;
        d=v;
    }

}