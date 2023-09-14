package kkJava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class userIpOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the list ");
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // input
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        //output
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
