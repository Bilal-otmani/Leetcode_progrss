class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p == 0) return 0 ;
        Arrays.sort(nums);
        int lo = 0 ; int hi = nums[nums.length -1] - nums[0] ;

        int  result = hi ;

         while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isValid(nums, mid, p)) {
                result = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return result;

    }

    public boolean isValid(int nums[] , int th , int p){
         int i = 0, count = 0;
        while (i < nums.length - 1) {
            if (Math.abs(nums[i] - nums[i + 1]) <= th) {
                count++;
                i += 2;
            } else {
                i++;
            }
            if (count == p) return true;
        }
        return false;
    }
}