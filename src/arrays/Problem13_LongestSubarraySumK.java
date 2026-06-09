package arrays;

public class Problem13_LongestSubarraySumK {
    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxlen = 0;
        int left = 0, right = 0;
        int sum = nums[0];

        while (right < n) {
            // shrink window from left when sum exceeds k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // update maxlen if sum equals k
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }

            // expand window to right
            right++;
            if (right < n) {
                sum += nums[right];
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        // Test Case 1 - normal case
        int[] arr1 = {1, 2, 3, 1, 1, 1};
        System.out.println("Test 1: " + longestSubarray(arr1, 6)); // Expected: 4

        // Test Case 2 - sum at beginning
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Test 2: " + longestSubarray(arr2, 3)); // Expected: 2

        // Test Case 3 - all same elements
        int[] arr3 = {5, 5, 5, 5};
        System.out.println("Test 3: " + longestSubarray(arr3, 10)); // Expected: 2

        // Test Case 4 - single element equals k
        int[] arr4 = {1, 2, 3};
        System.out.println("Test 4: " + longestSubarray(arr4, 2)); // Expected: 1

        // Test Case 5 - entire array sums to k
        int[] arr5 = {1, 2, 3};
        System.out.println("Test 5: " + longestSubarray(arr5, 6)); // Expected: 3
    }
}
