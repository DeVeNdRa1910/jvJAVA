package cwJava.string;

public class methods {
    public static void main(String[] args) {
        String name = "DeVeNdRa";
        String name2 = "    dev   ";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name2);
        System.out.println(name2.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('v','w'));
        System.out.println(name.replace("NdR","ndr"));
        System.out.println(name.replace("e","ai"));
        System.out.println(name.startsWith("DeV"));
        System.out.println(name.startsWith("Dev"));
        System.out.println(name.endsWith("dRa"));
        System.out.println(name.endsWith("dra"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('e'));

    }
}
