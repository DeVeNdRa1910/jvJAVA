package cwJava.loops.patternKK;

public class pattern_8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    public static void pattern8(int n){
        for (int i = 1; i <= 2*n-1 ; i++) {
            if (i<=n){
                for (int j = 1; j <= n-i ; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2*i-1 ; j++) {
                    System.out.print("* ");
                }
            } else{
                for (int j = 1; j <= i-n ; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2*(2*n-i)-1 ; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
