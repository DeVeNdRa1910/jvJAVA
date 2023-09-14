package cwJava.loops;

import java.util.Scanner;

public class aToThePowerB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 1;
        for (int i = 0; i < b; i++) {
            ans = ans*a;
        }
        System.out.println(ans);
    }
}
