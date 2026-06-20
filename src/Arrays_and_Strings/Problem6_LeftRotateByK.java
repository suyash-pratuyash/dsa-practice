package Arrays_and_Strings;// Problem 6: Left Rotate Array by K Places
// Striver A2Z Sheet - Step 3.1 | Day 2 | LeetCode 189 (left variant)
// Time: O(n) | Space: O(k)

import java.util.Arrays;

public class Problem6_LeftRotateByK {
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // handles k >= n (e.g. k=7 on size 5 = same as k=2)

        // Step 1: save first k elements in temp
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: shift remaining elements to the left
        for (int j = k; j < n; j++) {
            arr[j - k] = arr[j];
        }

        // Step 3: place temp at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        // Test Case 1 - normal case
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateLeft(arr1, 2);
        System.out.println("Test 1: " + Arrays.toString(arr1)); // Expected: [3, 4, 5, 1, 2]

        // Test Case 2 - k = 1
        int[] arr2 = {1, 2, 3};
        rotateLeft(arr2, 1);
        System.out.println("Test 2: " + Arrays.toString(arr2)); // Expected: [2, 3, 1]

        // Test Case 3 - k >= n (k=4 same as k=1 for size 3)
        int[] arr3 = {1, 2, 3};
        rotateLeft(arr3, 4);
        System.out.println("Test 3: " + Arrays.toString(arr3)); // Expected: [2, 3, 1]

        // Test Case 4 - k = n (full rotation, no change)
        int[] arr4 = {1, 2, 3, 4, 5};
        rotateLeft(arr4, 5);
        System.out.println("Test 4: " + Arrays.toString(arr4)); // Expected: [1, 2, 3, 4, 5]
    }
}
