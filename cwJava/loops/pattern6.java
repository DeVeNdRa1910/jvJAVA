package cwJava.loops;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
