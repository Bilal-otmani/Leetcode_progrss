class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int l = 0, zeros = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) zeros++;          

            while (zeros > 1) {                
                if (nums[l] == 0) zeros--;
                l++;
            }

            res = Math.max(res, r - l + 1);     
        }
        return res;
    }
}