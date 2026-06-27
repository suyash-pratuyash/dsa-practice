package Arrays_and_Strings;// Problem 3: Remove Duplicates from Sorted Array
// Striver A2Z Sheet - Step 3.1 | Day 1 | LeetCode 26
// Time: O(n) | Space: O(1)

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int j = 0; // slow pointer - tracks last unique element position
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { // new unique element found
                j++;
                arr[j] = arr[i];    // write it to the next position
            }
            // duplicate? just skip - i moves forward automatically
        }
        return j + 1; // j is 0-indexed, so count = j + 1
    }

    public static void main(String[] args) {
        // Test Case 1 - mixed duplicates
        int[] arr1 = {1, 1, 2, 2, 3, 4, 4};
        int k1 = removeDuplicates(arr1);
        System.out.print("Test 1: k=" + k1 + " | arr = [");
        for (int i = 0; i < k1; i++) System.out.print(arr1[i] + (i < k1 - 1 ? ", " : ""));
        System.out.println("]"); // Expected: k=4, [1,2,3,4]

        // Test Case 2 - all same
        int[] arr2 = {1, 1, 1, 1};
        int k2 = removeDuplicates(arr2);
        System.out.print("Test 2: k=" + k2 + " | arr = [");
        for (int i = 0; i < k2; i++) System.out.print(arr2[i] + (i < k2 - 1 ? ", " : ""));
        System.out.println("]"); // Expected: k=1, [1]

        // Test Case 3 - no duplicates
        int[] arr3 = {1, 2, 3};
        int k3 = removeDuplicates(arr3);
        System.out.print("Test 3: k=" + k3 + " | arr = [");
        for (int i = 0; i < k3; i++) System.out.print(arr3[i] + (i < k3 - 1 ? ", " : ""));
        System.out.println("]"); // Expected: k=3, [1,2,3]

        // Test Case 4 - single element
        int[] arr4 = {5};
        int k4 = removeDuplicates(arr4);
        System.out.print("Test 4: k=" + k4 + " | arr = [");
        for (int i = 0; i < k4; i++) System.out.print(arr4[i] + (i < k4 - 1 ? ", " : ""));
        System.out.println("]"); // Expected: k=1, [5]
    }
}
