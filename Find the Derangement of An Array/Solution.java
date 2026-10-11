class Solution {
    private static final int MOD = 1_000_000_007;

    public int findDerangement(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        long prev2 = 0; 
        long prev1 = 1; 

        for (int i = 3; i <= n; i++) {
            long cur = (i - 1) * ((prev1 + prev2) % MOD) % MOD;
            prev2 = prev1;
            prev1 = cur;
        }
        return (int) prev1;
    }
}