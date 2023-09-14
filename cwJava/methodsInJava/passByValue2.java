package cwJava.methodsInJava;

public class passByValue2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Befo");
    }
    public static void swap(int x , int y){
        int c = x;
        x = y;
        y = c;
    }
}
