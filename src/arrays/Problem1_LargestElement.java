package arrays;
// Problem 1: Find the Largest Element in an Array
// Striver A2Z Sheet - Step 3.1 | Day 1
// Time: O(n) | Space: O(1)

public class Problem1_LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0]; // start with first element (handles negatives correctly)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test Case 1 - normal array
        int[] arr1 = {3, 1, 7, 2, 9, 4};
        System.out.println("Test 1: " + findLargest(arr1)); // Expected: 9

        // Test Case 2 - single element
        int[] arr2 = {1};
        System.out.println("Test 2: " + findLargest(arr2)); // Expected: 1

        // Test Case 3 - all negatives (would fail if max was initialized to 0)
        int[] arr3 = {-5, -3, -9, -1};
        System.out.println("Test 3: " + findLargest(arr3)); // Expected: -1

        // Test Case 4 - all same elements
        int[] arr4 = {4, 4, 4, 4};
        System.out.println("Test 4: " + findLargest(arr4)); // Expected: 4
    }
}
