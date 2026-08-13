class Solution {
    public boolean rec(int i , int [] nums, int s , int [][] dp){
        if (s == 0) return true;
        if (i == 0) return nums[i] == s;
        if (dp[i][s] != -1) {
            if (dp[i][s] == 0) return false;
            else return true;
        }

        boolean np = rec(i-1,nums,s,dp);
        boolean p = false;
        if (nums[i] <= s) p = rec(i-1,nums,s-nums[i],dp);
        dp[i][s] = (np||p)?1:0;
        return np||p;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int s = 0;
        for (int i = 0 ; i < n ; i++) s=s+nums[i];

        if (s%2 == 1) return false;
        s = s/2;

        boolean [][]dp = new boolean[n][s+1];
        // int [][]dp = new int[n][s+1];
        // for (int i = 0 ; i < n ; i++){
        //     for (int j = 0 ; j <=s ; j++){
        //         dp[i][j] = -1;
        //     }
        // } 

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <=s ; j++){
                if (j == 0) dp[i][j] = true;
                else if (i == 0) dp[i][j] = (nums[i]==j);
                else{
                    boolean np = dp[i-1][j];
                    boolean p = false;
                    if (nums[i] <= j) p = dp[i-1][j - nums[i]];
                    dp[i][j] = (np||p);
                }

            }
        }

        // return rec(n-1,nums,s,dp);
        return dp[n-1][s];
    }
}