package kkAssignments.functions;

public class q7 {
    public static void main(String[] args) {
        System.out.println(isPrime(172));
        System.out.println(isPrime2(172));
    }
    public static boolean isPrime(int n){
        if(n == 1 || n == 0) return false;
        if (n == 2 || n == 3){
            return true;
        }
        for (int i = 4; i < n ; i++) {
            if (n%i == 0) return false;
        }

        return true;
    }
    public static boolean isPrime2(int n){
        if(n == 1 || n == 0) return false;
        if (n == 2 || n == 3){
            return true;
        }
        for (int i = 4; i*i < n ; i++) {
            if (n%i == 0) return false;
        }

        return true;
    }
}
