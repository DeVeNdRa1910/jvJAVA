package cwJava.conditionals;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yr = in.nextInt();
        if(yr%4 == 0 ){
            if(yr%100 == 0){
                if (yr%400 == 0){
                    System.out.println("yes");
                }else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Yes");
            }
        }
        else{
            System.out.println("No");
        }
    }
}