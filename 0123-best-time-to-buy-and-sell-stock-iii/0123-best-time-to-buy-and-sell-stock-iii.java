class Solution {
    public int rec(int i , boolean buy, int cap, int[]prices,int[][][]dp){
        if (i == prices.length) return 0;
        if (cap == 0) return 0;
        if(dp[i][buy?1:0][cap] != 0) return dp[i][buy?1:0][cap];
        if (buy){
            return dp[i][1][cap] = Math.max(-prices[i] + rec(i+1,false,cap,prices,dp) , 0 + rec(i+1,true,cap,prices,dp));
        }else{
            return dp[i][0][cap] = Math.max(prices[i] + rec(i+1,true,cap-1,prices,dp) , 0 + rec(i+1,false,cap,prices,dp));
        }
    }
    public int maxProfit(int[] prices) {
        // int [][][] dp = new int[prices.length+1][2][3];
        // return rec(0,true,2,prices,dp);
        int [][][] dp = new int[prices.length+1][2][3];
        for (int i = prices.length -1 ; i >=0 ; i--){
            for (int j = 1 ; j<=2 ; j++){
                dp[i][1][j] = Math.max(-prices[i] + dp[i+1][0][j] , 0 + dp[i+1][1][j]);
                dp[i][0][j] = Math.max(prices[i] + dp[i+1][1][j-1] , 0 + dp[i+1][0][j]);

            }
        }
        return dp[0][1][2];

    }
}