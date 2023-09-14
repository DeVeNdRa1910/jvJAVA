package kkJava.LinearSearchAlgo;

import java.util.Arrays;

public class Q2 {
    // Linear Serach In string
    public static void main(String[] args) {
        String name = "Devendra";
        char target = 'a';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }
    // boolean
    private static boolean search(String name , char target){
        if(name.length() == 0) return false;
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)) return true;
        }
        return false;
    }
    //return index 
    private static int search2(String name , char target){
        if(name.length() == 0) return -1;
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)) return i;
        }
        return -1;
    }
    
}
