package kkJava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] ="DEVENDRA";
        str[1] ="devendra";
        str[2] ="Dev";
        str[3] ="Jaybant";
        str[4] ="Vishwakarma";

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        for(String name : str){
            System.out.print(name + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(str));

    }
}