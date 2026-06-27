package Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

// LeetCode Question 1 - Two Sum
// Given an array of integers nums and an integer target, return indices of the
// two numbers such that they add up to target.

class Solu {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int comp = target - nums[i];
            if (numMap.containsKey(comp) && numMap.get(comp) != i) {
                return new int[]{i, numMap.get(comp)};
            }
        }

        return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solu solution = new Solu();

        // Test Case 1
        // Input: nums = [2, 7, 11, 15], target = 9
        // Expected Output: [0, 1]  (nums[0] + nums[1] = 2 + 7 = 9)
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println("Expected: [0, 1]");
        System.out.println();

        // Test Case 2
        // Input: nums = [3, 2, 4], target = 6
        // Expected Output: [1, 2]  (nums[1] + nums[2] = 2 + 4 = 6)
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Expected: [1, 2]");
    }
}