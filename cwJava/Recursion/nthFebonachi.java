package cwJava.Recursion;

import java.util.Scanner;

public class nthFebonachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(febo(n));
    }
    public static int febo(int n){
        if(n == 1 || n == 0) return n;
        return febo(n-1)+febo(n-2);
    }
}
