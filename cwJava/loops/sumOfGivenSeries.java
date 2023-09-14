package cwJava.loops;

import java.util.Scanner;

public class sumOfGivenSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0)
                ans -= i;
            else
                ans += i;
        }
        System.out.println(ans);
    }
}
