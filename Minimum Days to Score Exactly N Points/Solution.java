class Solution {
    public int minDays(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0]=-1;

        for(int i = 0 ; i<=n ; i++){
            for(int k = 1;;k++){
                int t = k*(k+1)/2;

                if(t>i) break ;

                if(dp[i-t]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i - t] + k + 1);
                }
            }
        }
        return dp[n];
    }
}