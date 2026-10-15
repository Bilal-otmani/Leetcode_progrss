class Solution {
    public int minimumSwaps(int[] nums) {
           int minsSwaps = 0;
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                while (left < right && nums[right] == 0) {
                    right--;
                }
                if (left >= right) {
                    return minsSwaps;
                }
                while (left < right && nums[left] != 0) {
                    left++;
                }
                if (left >= right) {
                    return minsSwaps;
                }
                minsSwaps++;
                left++;
                right--;
            }
            return minsSwaps;
}}

        
    
