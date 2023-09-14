package cwJava.ArrayList;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element in the list
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // acces the element if have index of those element

        int elem = list.get(3);
        int elem2 = list.get(7);
        System.out.println(elem2 + " & " + elem);

        // size of the list
        int size = list.size();

        //print list with list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");  // 5 6 7 8 9 1 2 3 4 5
        }
        System.out.println();

        // print list without list
        System.out.println(list); // [5,6,7,8,9,1,2,3,4,5]

        // add an element at index (any thing you want) i
        list.add(3,100);

        System.out.println(list); // [5,6,7,100,8,9,1,2,3,4,5]

        // If you want change the value present at index i
        list.set(3,10); // // [5,6,7,10,8,9,1,2,3,4,5]
        System.out.println(list);

        // remove an element those index i
        list.remove(9);
        System.out.println(list);

        // remove an element whose index you dont know but you have the value of that element
        list.remove(Integer.valueOf(5)); // this method remove firs6 occurance that elment
        System.out.println(list);

        //checking if an element present in thre list or not
        boolean ans1 = list.contains(10);
        boolean ans2 = list.contains(1000);

        System.out.println(ans1+" & " + ans2);

        // If you don't specify class you can put anything inside list
        ArrayList l = new ArrayList();
        l.add(5);
        l.add(2.5f);
        l.add('D');
        l.add("Devendra");
        l.add("Kumar");
        l.add("Vishwakarma");
        l.add(true);
        System.out.println(l);



    }
}
