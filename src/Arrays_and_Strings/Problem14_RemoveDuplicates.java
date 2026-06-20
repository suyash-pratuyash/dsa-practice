package Arrays_and_Strings;

/**
 * LeetCode Problem 26: Remove Duplicates from Sorted Array
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once
 * and returns the new length of the array. Do not allocate extra space for another array.
 *
 * Time Complexity: O(n) - single pass through array
 * Space Complexity: O(1) - in-place solution
 */

class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}

public class Problem14_RemoveDuplicates {

    /**
     * Test Case 1: Array with multiple duplicates
     * Input: [1, 1, 2, 2, 2, 3]
     * Expected Output: 3 (modified array: [1, 2, 3, ...])
     */
    public static void testCase1() {
        Solution solution = new Solution();
        int[] arr = {1, 1, 2, 2, 2, 3};
        int result = solution.removeDuplicates(arr);

        System.out.println("Test Case 1:");
        System.out.println("Input: [1, 1, 2, 2, 2, 3]");
        System.out.println("Expected Length: 3");
        System.out.println("Actual Length: " + result);
        System.out.print("Modified Array (first " + result + " elements): [");
        for(int i = 0; i < result; i++) {
            System.out.print(arr[i]);
            if(i < result - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Status: " + (result == 3 ? "✓ PASS" : "✗ FAIL"));
        System.out.println();
    }

    /**
     * Test Case 2: Array where all elements are the same
     * Input: [1, 1, 1, 1, 1]
     * Expected Output: 1 (modified array: [1, ...])
     */
    public static void testCase2() {
        Solution solution = new Solution();
        int[] arr = {1, 1, 1, 1, 1};
        int result = solution.removeDuplicates(arr);

        System.out.println("Test Case 2:");
        System.out.println("Input: [1, 1, 1, 1, 1]");
        System.out.println("Expected Length: 1");
        System.out.println("Actual Length: " + result);
        System.out.print("Modified Array (first " + result + " elements): [");
        for(int i = 0; i < result; i++) {
            System.out.print(arr[i]);
            if(i < result - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Status: " + (result == 1 ? "✓ PASS" : "✗ FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("LeetCode Problem 26: Remove Duplicates from Sorted Array");
        System.out.println("=".repeat(60));
        System.out.println();

        testCase1();
        testCase2();

        System.out.println("=".repeat(60));
        System.out.println("All tests completed!");
    }
}




