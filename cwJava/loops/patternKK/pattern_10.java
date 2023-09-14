package cwJava.loops.patternKK;

public class pattern_10 {
    public static void main(String[] args) {
        pattern10(5);
    }
    public static void pattern10(int n){
        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i-n ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i <= n){
                for (int j = 1; j <= 2*i-3 ; j++) {
                    System.out.print(" ");
                }
                if(i!=1){
                    System.out.print("*");
                }
            }else{
                for (int j = (3*n+2)-2*i; j >= 1 ; j--) {
                    System.out.print(" ");
                }
                if(i != 2*n-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
