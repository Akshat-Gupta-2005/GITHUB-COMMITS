class Solution {
    public int rec(int i , int j , int n , List<List<Integer>> triangle , int [][]dp){
        if (i == n-1) return triangle.get(i).get(j);
        if (dp[i][j] != -1) return dp[i][j];
        int d = rec(i+1,j,n,triangle,dp);
        int dr = rec(i+1,j+1,n,triangle,dp);
        return dp[i][j] = Math.min(d,dr) + triangle.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [][] dp = new int[n][n];
        // for (int i = 0 ; i < n ; i++){
        //     for (int j = 0 ; j < n ; j++){
        //         dp[i][j] = -1;
        //     }
        // }

        for (int i = n-1 ; i >= 0 ; i--){
            for (int j = 0 ; j <= i ; j++){
                if (i == n-1) dp[i][j] = triangle.get(i).get(j);
                else{
                    int d = dp[i+1][j];
                    int dr = dp[i+1][j+1];
                    dp[i][j] = Math.min(d,dr) + triangle.get(i).get(j);
                }

            }
        }
        // return rec(0,0,n,triangle , dp);
        return dp[0][0];
    }
}