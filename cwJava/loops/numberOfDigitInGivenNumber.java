package cwJava.loops;

import java.util.Scanner;

public class numberOfDigitInGivenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int f = 0;
        while (num > 0){
            num = num/10;
            f++;
        }
        System.out.println("number of digit in given number => " + f);
    }
}
