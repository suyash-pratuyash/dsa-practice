package Arrays_and_Strings;// Problem 7: Move Zeroes to End
// Striver A2Z Sheet - Step 3.1 | Day 3 | LeetCode 283
// Time: O(n) | Space: O(1)

import java.util.Arrays;

public class Problem7_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0; // slow pointer - tracks next non-zero position
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {         // found a non-zero element
                int temp = nums[i];
                nums[i] = nums[j];      // swap to front
                nums[j] = temp;
                i++;                    // move slow pointer forward
            }
            // zero? skip — j moves forward automatically
        }
    }

    public static void main(String[] args) {
        // Test Case 1 - mixed zeros
        int[] arr1 = {0, 1, 0, 3, 12};
        moveZeroes(arr1);
        System.out.println("Test 1: " + Arrays.toString(arr1)); // Expected: [1, 3, 12, 0, 0]

        // Test Case 2 - zeros at start
        int[] arr2 = {0, 0, 1};
        moveZeroes(arr2);
        System.out.println("Test 2: " + Arrays.toString(arr2)); // Expected: [1, 0, 0]

        // Test Case 3 - no zeros
        int[] arr3 = {1, 2, 3};
        moveZeroes(arr3);
        System.out.println("Test 3: " + Arrays.toString(arr3)); // Expected: [1, 2, 3]

        // Test Case 4 - all zeros
        int[] arr4 = {0, 0, 0};
        moveZeroes(arr4);
        System.out.println("Test 4: " + Arrays.toString(arr4)); // Expected: [0, 0, 0]

        // Test Case 5 - single element
        int[] arr5 = {0};
        moveZeroes(arr5);
        System.out.println("Test 5: " + Arrays.toString(arr5)); // Expected: [0]
    }
}
