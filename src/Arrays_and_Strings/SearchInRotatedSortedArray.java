package Arrays_and_Strings;

/**
 * LeetCode Question 33: Search in Rotated Sorted Array
 *
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInRotatedSortedArray {

    /**
     * Searches for target in a rotated sorted array using binary search
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n - 1;

        // Find the rotation point
        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] > nums[n - 1]) lo = mid + 1;
            else hi = mid;
        }

        int rot = lo;
        lo = 0; hi = n - 1;

        // Binary search with rotation offset
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int real = (mid + rot) % n;

            if (nums[real] == target)
                return real;

            if (nums[real] < target) lo = mid + 1;
            else hi = mid - 1;
        }

        return -1;
    }

    // Test cases
    public static void main(String[] args) {
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

        // Test Case 1: Target exists in rotated array
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        int result1 = solution.search(nums1, target1);
        System.out.println("Test Case 1:");
        System.out.println("Input: nums = [4,5,6,7,0,1,2], target = 0");
        System.out.println("Output: " + result1);
        System.out.println("Expected: 4");
        System.out.println("Pass: " + (result1 == 4) + "\n");

        // Test Case 2: Target does not exist in array
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        int result2 = solution.search(nums2, target2);
        System.out.println("Test Case 2:");
        System.out.println("Input: nums = [4,5,6,7,0,1,2], target = 3");
        System.out.println("Output: " + result2);
        System.out.println("Expected: -1");
        System.out.println("Pass: " + (result2 == -1));
    }
}
