package kkAssignments.arrays.Easy;
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
    }
    public static boolean checkIfPangram(String sentence) {
        // declare hashmap to store letters from sentience
        Map<Character, Integer> hash = new HashMap<>();
        // iterate over sentience:
        for(int i = 0; i < sentence.length(); i++) {
            // put letters into hashmap, since we dont neet to calculate specific number of letters we can just always set it to 1
            hash.put(sentence.charAt(i), 1);
        }
        // if hashmap is size of english alphabet return true, false otherwise
        return hash.size() == 26 ? true : false;
    }

}
