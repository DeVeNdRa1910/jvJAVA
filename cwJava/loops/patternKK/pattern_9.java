package cwJava.loops.patternKK;

public class pattern_9 {
    public static void main(String[] args) {
        pattern9(10);
    }
    public static void pattern9(int  n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j  >= 1 ; j--) {
                if(i+j == n+1 && i != n){
                    System.out.print("*");
                }
            }
            if(i==n){
                for (int j = 1; j <= 2*n-1 ; j++) {
                    System.out.print("*");
                }
            }
            if(i>= 2 && i <= n-1){
                for (int j = 1; j <= 2*i-3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
