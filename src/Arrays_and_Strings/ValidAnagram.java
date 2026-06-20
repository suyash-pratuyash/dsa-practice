package Arrays_and_Strings;
/**
 * LeetCode 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Problem:
 * Given two strings s and t, return true if t is an anagram of s,
 * and false otherwise.
 *
 * Approach:
 * Use a HashMap to count character frequencies in s, then decrement
 * counts while iterating through t. If any character in t is missing
 * from the map or its count reaches 0, the strings are not anagrams.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
import java.util.Map;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;
            }
            counter.put(ch, counter.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        // Test Case 1
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test Case 1: s=\"" + s1 + "\", t=\"" + t1 + "\"");
        System.out.println("Expected: true, Got: " + solution.isAnagram(s1, t1));

        // Test Case 2
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Test Case 2: s=\"" + s2 + "\", t=\"" + t2 + "\"");
        System.out.println("Expected: false, Got: " + solution.isAnagram(s2, t2));
    }
}