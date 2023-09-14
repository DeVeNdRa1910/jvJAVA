package cwJava.loops.patternKK;

public class pattern_6 {
    public static void main(String[] args) {
        pattern6(6);
    }
    public static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1 ; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
