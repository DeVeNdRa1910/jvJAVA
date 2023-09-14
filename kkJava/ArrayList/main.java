package kkJava.ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(45);
        list.add(65);
        list.add(32);
        System.out.println(list.get(1));
        System.out.println(list.contains(65));
        System.out.println(list.get(3));
        list.set(3, 98);
        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list);

    }
}
