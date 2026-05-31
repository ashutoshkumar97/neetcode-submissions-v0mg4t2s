class Solution {
    public int maxProfit(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
        }

        int i = 0, j = i + 1;
        int maxProfit = 0;

        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            } else {
                i = j;
            }
            j++;
        }
        return maxProfit;
    }
}
