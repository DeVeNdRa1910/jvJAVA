package kkAssignments.arrays.Easy;
import java.util.*;
public class q18 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/add-to-array-form-of-integer/
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int carry = 0, i = num.length - 1;
        while (i >= 0 || k > 0) {
            int sum = carry + k % 10;
            if (i >= 0) sum += num[i];
            ans.addFirst(sum % 10);
            carry = sum / 10;
            k /= 10;
            i--;
        }
        if (carry != 0) ans.addFirst(carry);
        return ans;
    }
}
