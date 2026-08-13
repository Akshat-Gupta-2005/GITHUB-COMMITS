class Solution {
    public int rec(int n , int m , int [][] grid , int [][]dp){
        if (grid[n][m] == 1 || n < 0 || m < 0) return 0;
        if (n == 0 && m == 0) return 1;
        if (dp[n][m] != -1) return dp[n][m];

        int t = 0;
        if (n>0) t = rec(n-1,m,grid,dp);
        int l = 0;
        if (m>0) l = rec(n,m-1,grid,dp);

        return dp[n][m]= l+t;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;
        int [][]dp = new int[n][m];
        for (int i = 0; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                dp[i][j] = -1;
            }
        }

        return rec(n-1,m-1,obstacleGrid,dp);

        // if (n == 1 && m == 1){
        //     if (obstacleGrid[0][0] == 1) return 0;
        //     else return 1;
        // }

        // int [] dp = new int[n];

        // // for (int i = 0 ; i < n ; i++){
        // //     dp[i] = 1;
        // // }

        // for (int j = m-1 ; j >= 0 ; j--){
        //     for (int i = n-1 ; i >= 0 ; i--){
        //         if (i == n-1 && j == m-1) dp[i] = 0;
        //         else if ((i == n-1 || j == m-1 )) {
        //             if (obstacleGrid[i][j] == 0)
        //                 dp[i] = 1;
        //             else
        //                 dp[i] = 0;
        //         }
        //         else{
        //             dp[i] = dp[i] + dp[i+1];
        //             if (obstacleGrid[i][j] == 1) dp[i] = 0;
        //         }
        //     }
        // }

        // return dp[n-1];
    }
}