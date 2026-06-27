package Arrays_and_Strings;// Problem 4: Left Rotate an Array by One Place
// Striver A2Z Sheet - Step 3.1 | Day 2
// Time: O(n) | Space: O(1)

import java.util.Arrays;

public class LeftRotateByOne {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;

        if (n <= 1) return; // edge case - nothing to rotate

        int fr = arr[0];            // save first element
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];    // shift every element left by 1
        }
        arr[n - 1] = fr;            // place saved element at end
    }

    public static void main(String[] args) {
        // Test Case 1 - normal array
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateByOne(arr1);
        System.out.println("Test 1: " + Arrays.toString(arr1)); // Expected: [2, 3, 4, 5, 1]

        // Test Case 2 - two elements
        int[] arr2 = {3, 7};
        rotateByOne(arr2);
        System.out.println("Test 2: " + Arrays.toString(arr2)); // Expected: [7, 3]

        // Test Case 3 - single element (no change)
        int[] arr3 = {1};
        rotateByOne(arr3);
        System.out.println("Test 3: " + Arrays.toString(arr3)); // Expected: [1]

        // Test Case 4 - all same elements
        int[] arr4 = {5, 5, 5, 5};
        rotateByOne(arr4);
        System.out.println("Test 4: " + Arrays.toString(arr4)); // Expected: [5, 5, 5, 5]
    }
}
