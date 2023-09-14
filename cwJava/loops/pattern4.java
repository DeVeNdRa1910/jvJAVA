package cwJava.loops;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of row => ");
        int r = in.nextInt();
        System.out.print("Enter number of Column => ");
        int c = in.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = r-i+1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
