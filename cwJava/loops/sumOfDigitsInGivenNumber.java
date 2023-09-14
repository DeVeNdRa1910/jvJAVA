package cwJava.loops;

import java.util.Scanner;

public class sumOfDigitsInGivenNumber {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int sum =0;

            while(num > 0){
                sum = sum + num%10;
                num = num/10;
            }

            System.out.println(sum);
        }

}
