package kkAssignments.arrays.Easy;
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(index[i] , nums[i]);
        }
        for(int i = 0 ; i < n ; i++){
            target[i] = list.get(i);
        }
        return target;
    }
}
