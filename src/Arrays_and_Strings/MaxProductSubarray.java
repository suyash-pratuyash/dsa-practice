package Arrays_and_Strings;

// LeetCode 152 - Maximum Product Subarray
// Approach: Prefix & Suffix Product
// Time Complexity: O(n) | Space Complexity: O(1)

public class MaxProductSubarray {

    static class Solution {
        public int maxProduct(int[] nums) {

            int n = nums.length;
            int l = 1, r = 1;
            int ans = nums[0];

            for (int i = 0; i < n; i++) {

                // if any of l or r become 0 then update it to 1
                l = l == 0 ? 1 : l;
                r = r == 0 ? 1 : r;

                l *= nums[i];         // prefix product
                r *= nums[n - 1 - i]; // suffix product

                ans = Math.max(ans, Math.max(l, r));
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // ── Test Case 1 ──────────────────────────────────────────────────────────
        // Input : [2, 3, -2, 4]
        // Expected Output : 6  (subarray [2, 3])
        int[] nums1 = {2, 3, -2, 4};
        int result1 = solution.maxProduct(nums1);
        System.out.println("Test Case 1:");
        System.out.println("  Input    : [2, 3, -2, 4]");
        System.out.println("  Expected : 6");
        System.out.println("  Output   : " + result1);
        System.out.println("  Status   : " + (result1 == 6 ? "PASSED ✓" : "FAILED ✗"));

        System.out.println();

        // ── Test Case 2 ──────────────────────────────────────────────────────────
        // Input : [-2, 0, -1]
        // Expected Output : 0  (subarray [0])
        int[] nums2 = {-2, 0, -1};
        int result2 = solution.maxProduct(nums2);
        System.out.println("Test Case 2:");
        System.out.println("  Input    : [-2, 0, -1]");
        System.out.println("  Expected : 0");
        System.out.println("  Output   : " + result2);
        System.out.println("  Status   : " + (result2 == 0 ? "PASSED ✓" : "FAILED ✗"));
    }
}