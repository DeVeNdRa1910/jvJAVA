package kkJava.string;

public class str {
    public static void main(String[] args) {
        String a = "Devendra";
        String b = "Devendra";
        System.out.println(a==b);
        System.out.println(str());
    }
    private static boolean str(){
        String a = new String("Devendra");
        String b = new String("Devendra");
        return a == b;
    }
}