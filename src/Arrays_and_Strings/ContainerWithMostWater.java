package Arrays_and_Strings;

gti /**
 * LeetCode Problem: Container With Most Water
 * 
 * You are given an integer array height of length n. There are n vertical lines 
 * drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the 
 * container holds the most water. Return the maximum area of water a container can store.
 * 
 * Approach: Two-pointer technique
 * - Start with the widest container (left at 0, right at n-1)
 * - Calculate area and track maximum
 * - Move the pointer pointing to the shorter line inward (to potentially find a taller line)
 * - Time Complexity: O(n), Space Complexity: O(1)
 */
public class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max = 0;

        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    // Test cases
    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();

        // Test case 1: [1,8,6,2,5,4,8,3,7]
        // Expected output: 49
        // Explanation: The vertical lines at index 1 (height=8) and index 8 (height=7) 
        // form a container with width 7 and height 7, giving area = 7 * 7 = 49
        int[] testCase1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result1 = container.maxArea(testCase1);
        System.out.println("Test Case 1: " + result1 + " (Expected: 49) - " + (result1 == 49 ? "PASS" : "FAIL"));

        // Test case 2: [1,1]
        // Expected output: 1
        // Explanation: The container with width 1 and height min(1,1) = 1, giving area = 1 * 1 = 1
        int[] testCase2 = { 1, 1 };
        int result2 = container.maxArea(testCase2);
        System.out.println("Test Case 2: " + result2 + " (Expected: 1) - " + (result2 == 1 ? "PASS" : "FAIL"));
    }
}
