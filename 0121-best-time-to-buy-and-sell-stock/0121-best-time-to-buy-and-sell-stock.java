class Solution {
    public int maxProfit(int[] prices) {
        int minC = prices[0];
        int maxP = 0;

        for (int i = 1; i < prices.length ; i++){
            int cost = prices[i] - minC;
            maxP = Math.max(maxP, cost);
            minC = Math.min(minC, prices[i]);
        }

        return maxP;
    }
}