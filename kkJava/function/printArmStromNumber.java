package kkJava.function;

import java.util.Scanner;

public class printArmStromNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("from => ");
        int a = in.nextInt();
        System.out.print("to => ");
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            if (isArmstrom(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    public static boolean isArmstrom(int n){
        int org = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum += rem*rem*rem;
        }
        if(sum == org) return true;
        return false;
    }

}
