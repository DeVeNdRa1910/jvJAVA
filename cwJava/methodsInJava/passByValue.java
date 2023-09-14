package cwJava.methodsInJava;

public class passByValue {
    public static void main(String[] args) {
        int a =5;
        System.out.println("Before Change "+a);
        change(a);
        System.out.println("After Change "+a);
    }

    public static void change(int a){
        a *= 100;
        System.out.println("Inside Change "+ a);
    }
}

