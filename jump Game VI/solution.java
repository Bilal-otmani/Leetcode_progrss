class Solution {

    public int maxResult(int[] nums, int k) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            int maxres = Integer.MIN_VALUE;
            for (int j = i + 1; j <= Math.min(n - 1, i + k); j++) {
                maxres = Math.max(maxres, dp[j]);
            }

            dp[i] = nums[i] + maxres;
        }

        return dp[0];
    }
}