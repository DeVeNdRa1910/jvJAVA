package cwJava.loops.patternKK;

public class pattern_5 {
    public static void main(String[] args) {
        pattern5(6);
    }
    public static void pattern5(int  n){
        for (int i = 1; i <= 2*n; i++) {
            if(i <= n){
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
            }else {
                for (int j = 2*n-i ; j >= 1 ; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
