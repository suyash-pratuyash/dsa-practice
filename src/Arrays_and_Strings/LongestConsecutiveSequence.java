package Arrays_and_Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

        // Test Case 1: [100, 4, 200, 1, 3, 2]
        // Expected: 4 (the sequence [1, 2, 3, 4])
        int[] test1 = {100, 4, 200, 1, 3, 2};
        int result1 = solution.longestConsecutive(test1);
        System.out.println("Test Case 1: " + result1);
        System.out.println("Expected: 4");
        System.out.println("Pass: " + (result1 == 4));

        System.out.println();

        // Test Case 2: [9, 1,4,7, 3,2,8,5, 6]
        // Expected: 9 (the sequence [1, 2, 3, 4, 5, 6, 7, 8, 9])
        int[] test2 = {9, 1, 4, 7, 3, 2, 8, 5, 6};
        int result2 = solution.longestConsecutive(test2);
        System.out.println("Test Case 2: " + result2);
        System.out.println("Expected: 9");
        System.out.println("Pass: " + (result2 == 9));
    }
}
