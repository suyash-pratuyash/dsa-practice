package Arrays_and_Strings;

import java.util.Arrays;

/**
 * LeetCode Problem 238: Product of Array Except Self
 *
 * Given an integer array nums, return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) excluding the output array
 */
public class Product_of_array_except_self {

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] answer = new int[n];
            answer[0] = 1;

            // First pass: calculate left product for each position
            for (int i = 1; i < n; i++) {
                answer[i] = answer[i - 1] * nums[i - 1];
            }

            int rightProduct = 1;
            // Second pass: multiply by right product
            for (int i = n - 1; i >= 0; i--) {
                answer[i] *= rightProduct;
                rightProduct *= nums[i];
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Basic example from LeetCode
        System.out.println("Test Case 1:");
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + Arrays.toString(result1));
        System.out.println("Expected: [24, 12, 8, 6]");
        System.out.println("Pass: " + Arrays.equals(result1, new int[]{24, 12, 8, 6}));
        System.out.println();

        // Test Case 2: Array with two elements
        System.out.println("Test Case 2:");
        int[] nums2 = {2, 3};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + Arrays.toString(result2));
        System.out.println("Expected: [3, 2]");
        System.out.println("Pass: " + Arrays.equals(result2, new int[]{3, 2}));
        System.out.println();

        // Test Case 3: Array with one element
        System.out.println("Test Case 3:");
        int[] nums3 = {5};
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + Arrays.toString(result3));
        System.out.println("Expected: [1]");
        System.out.println("Pass: " + Arrays.equals(result3, new int[]{1}));
        System.out.println();

        // Test Case 4: Array with negative numbers
        System.out.println("Test Case 4:");
        int[] nums4 = {-1, 2, 0, -3};
        int[] result4 = solution.productExceptSelf(nums4);
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output: " + Arrays.toString(result4));
        System.out.println("Expected: [0, 0, -6, 0]");
        System.out.println("Pass: " + Arrays.equals(result4, new int[]{0, 0, -6, 0}));
        System.out.println();

        // Test Case 5: Array with all same numbers
        System.out.println("Test Case 5:");
        int[] nums5 = {2, 2, 2, 2};
        int[] result5 = solution.productExceptSelf(nums5);
        System.out.println("Input: " + Arrays.toString(nums5));
        System.out.println("Output: " + Arrays.toString(result5));
        System.out.println("Expected: [8, 8, 8, 8]");
        System.out.println("Pass: " + Arrays.equals(result5, new int[]{8, 8, 8, 8}));
        System.out.println();

        // Test Case 6: Another common example
        System.out.println("Test Case 6:");
        int[] nums6 = {4, 5, 1, 8, 2};
        int[] result6 = solution.productExceptSelf(nums6);
        System.out.println("Input: " + Arrays.toString(nums6));
        System.out.println("Output: " + Arrays.toString(result6));
        System.out.println("Expected: [80, 64, 320, 40, 160]");
        System.out.println("Pass: " + Arrays.equals(result6, new int[]{80, 64, 320, 40, 160}));
        System.out.println();

        System.out.println("All tests completed!");
    }
}

