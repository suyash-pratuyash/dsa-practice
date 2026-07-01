package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKfreqElements {

	// Returns the k most frequent elements in nums (order by frequency desc)
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		List<Integer> keys = new ArrayList<>(map.keySet());

		keys.sort((a, b) -> map.get(b) - map.get(a));

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = keys.get(i);
		}

		return result;
	}

	// Simple runner with two test cases
	public static void main(String[] args) {
		TopKfreqElements solver = new TopKfreqElements();

		// Test case 1
		int[] nums1 = {1, 1, 1, 2, 2, 3};
		int k1 = 2;
		int[] res1 = solver.topKFrequent(nums1, k1);
		System.out.println("Test 1 input: " + Arrays.toString(nums1) + " k=" + k1);
		System.out.println("Expected (example): [1, 2]  -> Actual: " + Arrays.toString(res1));

		// Test case 2
		int[] nums2 = {1};
		int k2 = 1;
		int[] res2 = solver.topKFrequent(nums2, k2);
		System.out.println("Test 2 input: " + Arrays.toString(nums2) + " k=" + k2);
		System.out.println("Expected: [1]  -> Actual: " + Arrays.toString(res2));
	}
}
