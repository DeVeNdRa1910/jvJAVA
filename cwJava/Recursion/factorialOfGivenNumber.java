package cwJava.Recursion;

import java.util.Scanner;

public class factorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(factorial(n));
    }
    public static long factorial(long n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
