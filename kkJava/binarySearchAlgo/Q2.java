package kkJava.binarySearchAlgo;

public class Q2 {
    public static void main(String[] args) {
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }

        return letters[start%letters.length];

    }
}
