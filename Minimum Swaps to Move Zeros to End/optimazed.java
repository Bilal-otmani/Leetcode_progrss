class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros = 0;
        for (int x : nums) if (x == 0) zeros++;

        int limit = nums.length - zeros;
        int swaps = 0;
        for (int i = 0; i < limit; i++) {
            if (nums[i] == 0) swaps++;
        }
        return swaps;
    }
}