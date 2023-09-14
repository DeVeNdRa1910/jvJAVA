package kkAssignments.functions;

public class q3 {
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        isEligible(22);
    }
    public static void isEligible(int n){
        if(n >= 18)
            System.out.println("Person eligible for vote");
        else
            System.out.println("persin is not eligible for vote");
    }
}
