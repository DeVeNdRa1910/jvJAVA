package cwJava.conditionals;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Annul salary");
        float income = in.nextFloat();
        float tax = 0;

        if (income <= 2.5f){
            tax = tax +0;
        } else if (income > 2.5 && income <= 5.0f){
            tax = 0.05f *(income-2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.20f*(income-2.5f);
        } else {
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.20f*(10.0f-5.0f);
            tax = tax + 0.30f*(income-2.5f);
        }
        System.out.println("You have to pay tax amount of "+ tax);
    }
}
