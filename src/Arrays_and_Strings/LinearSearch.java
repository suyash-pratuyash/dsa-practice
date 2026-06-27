package Arrays_and_Strings;// Problem 8: Linear Search
// Striver A2Z Sheet - Step 3.1 | Day 3
// Time: O(n) | Space: O(1)

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // found — return index
            }
        }
        return -1;          // not found
    }

    public static void main(String[] args) {
        // Test Case 1 - element present in middle
        int[] arr1 = {3, 1, 7, 2, 9};
        System.out.println("Test 1: " + linearSearch(arr1, 7));  // Expected: 2

        // Test Case 2 - element not present
        int[] arr2 = {3, 1, 7, 2, 9};
        System.out.println("Test 2: " + linearSearch(arr2, 5));  // Expected: -1

        // Test Case 3 - element at first position
        int[] arr3 = {5, 1, 2, 3};
        System.out.println("Test 3: " + linearSearch(arr3, 5));  // Expected: 0

        // Test Case 4 - element at last position
        int[] arr4 = {1, 2, 3, 9};
        System.out.println("Test 4: " + linearSearch(arr4, 9));  // Expected: 3

        // Test Case 5 - single element found
        int[] arr5 = {5};
        System.out.println("Test 5: " + linearSearch(arr5, 5));  // Expected: 0

        // Test Case 6 - single element not found
        int[] arr6 = {5};
        System.out.println("Test 6: " + linearSearch(arr6, 3));  // Expected: -1
    }
}
