class Solution {
    public int minimumSwaps(int[] nums) {
        int l = 0, r = nums.length - 1;
        int swap = 0;

        while (l < r) {
            if (nums[r] == 0) {
                r--;                  
            } else if (nums[l] != 0) {
                l++;                  
            } else {
            
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
                swap++;
            }
        }

        return swap;
    }
}