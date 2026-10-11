class Solution {
    private int dp[][][];
    private static final int MOD = 1_000_000_007;
    private int dfs(int r , int c , int moves , int n , int m){
        if(r < 0 || r >=m || c < 0 || c >= n ) return 1;
        if(moves==0) return 0;
        if(dp[r][c][moves] != -1) return dp[r][c][moves];

        dp[r][c][moves]=((dfs(r+1,c,moves-1,n,m)+dfs(r-1,c,moves-1,n,m))%MOD +
                          (dfs(r,c+1,moves-1,n,m)+dfs(r,c-1,moves-1,n,m))%MOD )%MOD;

        return dp[r][c][moves];

    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
      dp = new int[m][n][maxMove+1];

      for(int[][] layer : dp){
         for(int [] row : layer){
            Arrays.fill(row,-1);
         }
      }

      return dfs(startRow , startColumn , maxMove , n , m);
}}