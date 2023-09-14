package cwJava.loops.patternKK;

public class pattern_7 {
    public static void main(String[] args) {
        pattern7(6);
    }
    public static void pattern7(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
