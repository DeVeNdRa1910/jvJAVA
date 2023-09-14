package cwJava.ArrayList;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(1);
        list.add(5);
        int j = list.size()-1;
        int i =0;
        System.out.println(list);
        while(i <= j){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list); // increasing order (By default )
        System.out.println(list);
        Collections.sort(list , Collections.reverseOrder()); // decreasing order
        System.out.println(list);

    }


}
