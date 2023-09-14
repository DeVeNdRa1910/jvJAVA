package cwJava.conditionals;
import java.util.Scanner;
public class isChildIsAdult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();
        if(age<12)
            System.out.println("Child");
        else if (age>12 && age<12)
            System.out.println("Teenager");
        else
            System.out.println("Adult");
    }
}
