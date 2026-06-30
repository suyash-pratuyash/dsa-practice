package Arrays_and_Strings;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();

        // Test Case 1: ["eat", "tea", "ate", "bat", "tab", "cat"]
        // Expected: [[eat, tea, ate], [bat, tab], [cat]]
        String[] test1 = {"eat", "tea", "ate", "bat", "tab", "cat"};
        List<List<String>> result1 = solution.groupAnagrams(test1);
        System.out.println("Test Case 1:");
        System.out.println("Input: " + Arrays.toString(test1));
        System.out.println("Output: " + result1);
        System.out.println();

        // Test Case 2: ["listen", "silent", "hello", "world", "enlist"]
        // Expected: [[listen, silent, enlist], [hello], [world]]
        String[] test2 = {"listen", "silent", "hello", "world", "enlist"};
        List<List<String>> result2 = solution.groupAnagrams(test2);
        System.out.println("Test Case 2:");
        System.out.println("Input: " + Arrays.toString(test2));
        System.out.println("Output: " + result2);
    }
}
