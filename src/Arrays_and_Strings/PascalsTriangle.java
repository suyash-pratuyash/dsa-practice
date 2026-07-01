package Arrays_and_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        if(numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            newRow.add(1);
        }

        for(int i = 1; i < numRows - 1; i++){
            newRow.set(i, prevRows.get(numRows - 2).get(i-1) + prevRows.get(numRows - 2).get(i));
        }

        prevRows.add(newRow);
        return prevRows;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();

        // Test Case 1: numRows = 5
        int numRows1 = 5;
        List<List<Integer>> result1 = pascalsTriangle.generate(numRows1);
        System.out.println("Test Case 1: numRows = " + numRows1);
        System.out.println("Output: " + result1);
        System.out.println("Expected: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
        System.out.println();

        // Test Case 2: numRows = 1
        int numRows2 = 1;
        List<List<Integer>> result2 = pascalsTriangle.generate(numRows2);
        System.out.println("Test Case 2: numRows = " + numRows2);
        System.out.println("Output: " + result2);
        System.out.println("Expected: [[1]]");
    }
}
