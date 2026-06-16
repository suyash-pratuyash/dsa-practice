package arrays;// Problem 9: Union of Two Sorted Arrays
// Striver A2Z Sheet - Step 3.1 | Day 3
// Time: O(n+m) | Space: O(n+m)

import java.util.*;

public class Problem9_UnionOfTwoSortedArrays {
    public static List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                // arr1 element is smaller — add if not duplicate
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                // arr2 element is smaller — add if not duplicate
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            } else {
                // both elements equal — add once, move both pointers
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++; j++;
            }
        }

        // remaining elements from arr1
        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        // remaining elements from arr2
        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        // Test Case 1 - overlapping arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7, 8};
        System.out.println("Test 1: " + findUnion(arr1, arr2, arr1.length, arr2.length));
        // Expected: [1, 2, 3, 4, 5, 7, 8]

        // Test Case 2 - duplicates within arrays
        int[] arr3 = {1, 1, 2, 3};
        int[] arr4 = {2, 3, 4, 4};
        System.out.println("Test 2: " + findUnion(arr3, arr4, arr3.length, arr4.length));
        // Expected: [1, 2, 3, 4]

        // Test Case 3 - no common elements
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {4, 5, 6};
        System.out.println("Test 3: " + findUnion(arr5, arr6, arr5.length, arr6.length));
        // Expected: [1, 2, 3, 4, 5, 6]

        // Test Case 4 - one array empty
        int[] arr7 = {1, 2, 3};
        int[] arr8 = {};
        System.out.println("Test 4: " + findUnion(arr7, arr8, arr7.length, arr8.length));
        // Expected: [1, 2, 3]
    }
}
