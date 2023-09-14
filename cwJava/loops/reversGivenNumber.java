package cwJava.loops;

import java.util.Scanner;

public class reversGivenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0 ;
        int n = 0 ;

        while (num > 0){
            n = num%10;
            sum = sum*10 + n;
            num = num/10;
        }
        System.out.println(sum);
    }
}
