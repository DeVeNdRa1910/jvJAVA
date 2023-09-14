package kkAssignments.arrays.Easy;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = max(candies);
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int temp = candies[i]+extraCandies;
            if(temp >= max){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
    public int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
}
