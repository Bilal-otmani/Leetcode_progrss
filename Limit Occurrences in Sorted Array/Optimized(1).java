class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
     int l = 0, cnt = 0;

        for (int r = 0; r < nums.length; r++) {
            if (r > 0 && nums[r] == nums[r - 1]) cnt++;
            else cnt = 1;

            if (cnt <= k) nums[l++] = nums[r];
        }

        return Arrays.copyOf(nums, l);
    }
}