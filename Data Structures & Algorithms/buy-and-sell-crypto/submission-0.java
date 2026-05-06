class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = 0;
        for(int i = 1 ; i < prices.length ; i++) {
            if(prices[i] < prices[start]) {
                start = i;
            } 
            profit = Math.max(profit, prices[i] - prices[start]);
        }
        return profit;
    }
}
