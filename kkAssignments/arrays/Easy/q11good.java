package kkAssignments.arrays.Easy;
import java.util.*;
public class q11good {
    public static void main(String[] args) {
        // https://leetcode.com/problems/count-items-matching-a-rule/description/
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for(int i = 0 ; i < items.size() ;i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) ans++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) ans++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) ans++;
        }
        return ans;
    }
}
