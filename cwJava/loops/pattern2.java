package cwJava.loops;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of row => ");
        int r = in.nextInt();
        System.out.print("Enter number of Column => ");
        int c = in.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i ==r || j == 1 || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
