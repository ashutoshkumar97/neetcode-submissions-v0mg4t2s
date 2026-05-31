class Solution {
    public int maxProfit(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
        }

        int i = 0, j = 1;
        int maxProfit = 0;

        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                i = j;
            }
            j++;
        }
        return maxProfit;
    }
}
