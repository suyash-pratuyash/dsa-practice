package Arrays_and_Strings;// Problem 2: Check if Array is Sorted
// Striver A2Z Sheet - Step 3.1 | Day 1
// Time: O(n) | Space: O(1)

public class IsSorted {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) { // found a violation
                return false;           // exit immediately
            }
        }
        return true; // no violation found - sorted
    }

    public static void main(String[] args) {
        // Test Case 1 - sorted ascending
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Test 1: " + isSorted(arr1)); // Expected: true

        // Test Case 2 - not sorted
        int[] arr2 = {1, 2, 1, 4, 5};
        System.out.println("Test 2: " + isSorted(arr2)); // Expected: false

        // Test Case 3 - equal elements (non-decreasing is valid)
        int[] arr3 = {1, 1, 1, 1};
        System.out.println("Test 3: " + isSorted(arr3)); // Expected: true

        // Test Case 4 - single element
        int[] arr4 = {5};
        System.out.println("Test 4: " + isSorted(arr4)); // Expected: true

        // Test Case 5 - descending (not sorted)
        int[] arr5 = {5, 4, 3, 2, 1};
        System.out.println("Test 5: " + isSorted(arr5)); // Expected: false
    }
}
