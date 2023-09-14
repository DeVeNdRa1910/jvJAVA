package cwJava.loops;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in .nextInt();
        int c= in .nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c ; j++) {
                if((i+j)%2 == 0)
                    System.out.print("1");
                else
                    System.out.print("2");
            }
            System.out.println();
        }
    }
}
