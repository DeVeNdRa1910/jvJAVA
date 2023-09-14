package cwJava.loops.patternKK;

public class pattern_3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    public static void pattern3(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = n-i+1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
