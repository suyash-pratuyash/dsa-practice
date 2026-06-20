package Arrays_and_Strings;

/**
 * Day 1 - DSA Problem 1
 * LC 268 - Missing Number
 * Difficulty: Easy
 * Striver A2Z Sheet: Step 3.1 #35
 *
 * Problem: Given array of n distinct numbers from range [0,n],
 *          find the one missing number.
 *
 * Approach 1 (Used): Sum Formula - O(n) time, O(1) space
 * Approach 2 (Bonus): XOR       - O(n) time, O(1) space
 */
public class MissingNumber {

    // -------------------------------------------------------
    // Approach 1: Sum Formula
    // Expected sum of 0..n = n*(n+1)/2
    // Missing number = expected - actual sum
    // -------------------------------------------------------
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp = n * (n + 1) / 2;
        int actual = 0;
        for (int i = 0; i < n; i++) {
            actual += nums[i];
        }
        return exp - actual;
    }

    // -------------------------------------------------------
    // Approach 2 (Bonus): XOR
    // XOR of a number with itself = 0
    // XOR every index and value together — paired numbers
    // cancel out, only missing number remains
    // -------------------------------------------------------
    public int missingNumberXOR(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }

    // -------------------------------------------------------
    // Test
    // -------------------------------------------------------
    public static void main(String[] args) {
        MissingNumber sol = new MissingNumber();

        int[] test1 = {3, 0, 1};           // expected: 2
        int[] test2 = {0, 1};              // expected: 2
        int[] test3 = {9,6,4,2,3,5,7,0,1}; // expected: 8

        System.out.println("Test 1: " + sol.missingNumber(test1)); // 2
        System.out.println("Test 2: " + sol.missingNumber(test2)); // 2
        System.out.println("Test 3: " + sol.missingNumber(test3)); // 8

        System.out.println("--- XOR approach ---");
        System.out.println("Test 1: " + sol.missingNumberXOR(test1)); // 2
        System.out.println("Test 3: " + sol.missingNumberXOR(test3)); // 8
    }
}
