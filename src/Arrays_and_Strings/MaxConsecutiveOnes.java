package Arrays_and_Strings;

/**
 * Day 1 - DSA Problem 2
 * LC 485 - Max Consecutive Ones
 * Difficulty: Easy
 * Striver A2Z Sheet: Step 3.1 #36
 * Problem: Given binary array, return the maximum number
 *          of consecutive 1s.
 * Pattern: Single pointer scan + running counter
 *          Same pattern as: Largest Element, Is Sorted
 * Time: O(n)   Space: O(1)
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count    = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    // -------------------------------------------------------
    // Test
    // -------------------------------------------------------
    public static void main(String[] args) {
        MaxConsecutiveOnes sol = new MaxConsecutiveOnes();

        int[] test1 = {1, 1, 0, 1, 1, 1};    // expected: 3
        int[] test2 = {1, 0, 1, 1, 0, 1};    // expected: 2
        int[] test3 = {1, 1, 1, 1};           // expected: 4
        int[] test4 = {0, 0, 0};              // expected: 0

        System.out.println("Test 1: " + sol.findMaxConsecutiveOnes(test1)); // 3
        System.out.println("Test 2: " + sol.findMaxConsecutiveOnes(test2)); // 2
        System.out.println("Test 3: " + sol.findMaxConsecutiveOnes(test3)); // 4
        System.out.println("Test 4: " + sol.findMaxConsecutiveOnes(test4)); // 0
    }
}