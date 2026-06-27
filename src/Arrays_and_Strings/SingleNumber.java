package Arrays_and_Strings;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];     // pairs cancel out, single remains
        }
        return xor;
    }

    public static void main(String[] args) {
        // Test Case 1 - single at end
        int[] arr1 = {2, 2, 1};
        System.out.println("Test 1: " + singleNumber(arr1)); // Expected: 1

        // Test Case 2 - single in middle
        int[] arr2 = {4, 1, 2, 1, 2};
        System.out.println("Test 2: " + singleNumber(arr2)); // Expected: 4

        // Test Case 3 - single element array
        int[] arr3 = {1};
        System.out.println("Test 3: " + singleNumber(arr3)); // Expected: 1

        // Test Case 4 - single at start
        int[] arr4 = {7, 3, 3, 5, 5};
        System.out.println("Test 4: " + singleNumber(arr4)); // Expected: 7

        // Test Case 5 - larger array
        int[] arr5 = {1, 1, 2, 2, 3, 3, 4};
        System.out.println("Test 5: " + singleNumber(arr5)); // Expected: 4
    }
}
