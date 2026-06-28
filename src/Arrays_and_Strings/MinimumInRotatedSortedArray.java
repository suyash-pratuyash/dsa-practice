package Arrays_and_Strings;

public class MinimumInRotatedSortedArray {

    /**
     * LeetCode 153: Find Minimum in Rotated Sorted Array
     *
     * Problem: Suppose an array of length n sorted in ascending order is rotated
     * between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7]
     * might become [4,5,6,7,0,1,2] after 4 rotations.
     *
     * Find the minimum element of this array.
     *
     * Approach: Binary Search
     * - Compare mid element with the last element
     * - If mid > last, minimum is in right half (l = mid + 1)
     * - Otherwise, minimum is in left half including mid (r = mid)
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int last = nums[n];
        int l = 0, r = n;

        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > last) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return nums[l];
    }

    public static void main(String[] args) {
        MinimumInRotatedSortedArray solution = new MinimumInRotatedSortedArray();

        // Test Case 1: Array rotated with minimum in middle
        // Original: [1,2,3,4,5,6,7], Rotated: [3,4,5,6,7,0,1,2]
        int[] nums1 = {3, 4, 5, 6, 7, 0, 1, 2};
        int result1 = solution.findMin(nums1);
        System.out.println("Test Case 1:");
        System.out.println("Input: [3, 4, 5, 6, 7, 0, 1, 2]");
        System.out.println("Expected Output: 0");
        System.out.println("Actual Output: " + result1);
        System.out.println("Status: " + (result1 == 0 ? "PASS ✓" : "FAIL ✗") + "\n");

        // Test Case 2: Array rotated once with minimum at start
        // Original: [1,3], Rotated: [3,1]
        int[] nums2 = {3, 1};
        int result2 = solution.findMin(nums2);
        System.out.println("Test Case 2:");
        System.out.println("Input: [3, 1]");
        System.out.println("Expected Output: 1");
        System.out.println("Actual Output: " + result2);
        System.out.println("Status: " + (result2 == 1 ? "PASS ✓" : "FAIL ✗"));
    }
}
