class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int i = 0;

       for (int j = n/2 ; j < n && i < n/2 ; j++ ){
        if(2*nums[i]<=nums[j]) i++;
       }

       return 2*i ;
    }
}