package cwJava.methodsInJava;

import java.util.Scanner;

class Algebra{
    int add(int a , int b){
        return a+b;
    }
}

public class sum {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(sum(num1,num2));
        System.out.println(obj.add(num1,num2));
    }
    public static int sum(int a , int b){
        return a+b;
    }
}
