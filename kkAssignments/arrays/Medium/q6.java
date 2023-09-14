package kkAssignments.arrays.Medium;

public class q6 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] =start;
        ans[1] = end;
        return ans;

    }
    public int search(int[] nums, int target, boolean findSratIndex) {
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findSratIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
