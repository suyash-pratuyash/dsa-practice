package Arrays_and_Strings;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		Solution sol = new Solution();

		int[] prices1 = {7, 1, 5, 3, 6, 4};
		System.out.println("Test 1 expected 5, got: " + sol.maxProfit(prices1));

		int[] prices2 = {7, 6, 4, 3, 1};
		System.out.println("Test 2 expected 0, got: " + sol.maxProfit(prices2));
	}
}

class Solution {
	public int maxProfit(int[] prices) {
	   if (prices == null || prices.length == 0) return 0;
	   int min = prices[0];
	   int profit = 0;

	   for(int i = 1; i < prices.length; i++){
		if(prices[i] < min){
			min = prices[i];
		}
		else {
			profit = Math.max(profit, prices[i] - min);
		}
	   }
	   return profit;
	}
}
