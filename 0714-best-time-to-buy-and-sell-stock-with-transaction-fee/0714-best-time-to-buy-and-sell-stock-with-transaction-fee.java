class Solution {
    public int rec(int i , boolean buy , int[]prices, int fee , int [][]dp){
        if (i==prices.length) return 0;
        if (dp[i][buy?1:0] != 0) return dp[i][buy?1:0];
        if (buy){
            return dp[i][1] = Math.max(-prices[i] + rec(i+1,false,prices,fee,dp) , 0 + rec(i+1,true,prices,fee,dp));
        }else{
            return dp[i][0] = Math.max(prices[i] - fee + rec(i+1,true,prices,fee,dp) , 0 + rec(i+1,false,prices,fee,dp));
        }
    }
    public int maxProfit(int[] prices, int fee) {
        int [][] dp = new int[prices.length+1][2];
        // return rec(0,true,prices,fee,dp);
        for (int i = prices.length - 1;  i >= 0 ; i --){
            dp[i][1] = Math.max(-prices[i] + dp[i+1][0] , 0 + dp[i+1][1]);
            dp[i][0] = Math.max(prices[i] - fee + dp[i+1][1] , 0 + dp[i+1][0]);

        }
        return dp[0][1];
    }
}