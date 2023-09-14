package cwJava.conditionals;
import java.util.Scanner;
public class ifcondi {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();

         if(num%2 == 0){
             System.out.println("Entered number is even");
         }else {
             System.out.println("Entered number is odd");
         }
    }
}
