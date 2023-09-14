package kkAssignments.functions;

public class q1 {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        int minNumber = min(2,5,8);
        int maxNumber = max(2,5,8);
        System.out.println("min number is => " + minNumber);
        System.out.println("max number is => " + maxNumber);
    }
    public static int max(int a , int b, int c){
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    public static int min(int a , int b, int c){
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else
            return c;
    }
}
