class Solution {
    public int rec(int i , boolean buy, int [] prices , int [][] dp){
        if (i >= prices.length) return 0;
        if (dp[i][buy?1:0] != 0) return dp[i][buy?1:0];
        if (buy){
            return dp[i][1] = Math.max( -prices[i] + rec(i+1,false,prices,dp) , 0 + rec(i+1,true,prices,dp));
        }else{
            return dp[i][0] = Math.max( prices[i] + rec(i+2,true,prices,dp) , 0 + rec(i+1,false,prices,dp));
        }
    }
    public int maxProfit(int[] prices) {
        int [][] dp = new int[prices.length+2][2];
        // return rec(0,true,prices,dp);
        for (int i = prices.length - 1; i>= 0 ; i--){
            dp[i][1] = Math.max( -prices[i] + dp[i+1][0] , 0 + dp[i+1][1]);
            dp[i][0] = Math.max( prices[i] + dp[i+2][1] , 0 + dp[i+1][0]);

        }
        return dp[0][1];
    }
}