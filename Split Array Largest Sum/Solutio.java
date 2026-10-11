class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0;
        long r = 0;
        for (int x : nums) {
            l = Math.max(l, x);   
            r += x;              
        }

        long lo = l, hi = r;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (canSplit(nums, k, mid)) hi = mid;   
            else lo = mid + 1;                      
        }
        return (int) lo;
    }

    private boolean canSplit(int[] nums, int k, long limit) {
        int parts = 1;
        long cur = 0;
        for (int x : nums) {
            if (cur + x > limit) {   
                parts++;
                cur = x;
                if (parts > k) return false;
            } else {
                cur += x;
            }
        }
        return true;
    }
}