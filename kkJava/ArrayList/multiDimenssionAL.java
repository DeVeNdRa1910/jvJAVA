package kkJava.ArrayList;
import java.util.*;

public class multiDimenssionAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        for(int i = 0 ;  i < 3 ; i++){
            mat.add(new ArrayList<>());
        }

        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3 ; j++){
                mat.get(i).add(in.nextInt());
            }
        }

    }
}
