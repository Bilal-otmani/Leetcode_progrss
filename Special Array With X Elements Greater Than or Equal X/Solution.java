class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n + 1];

        for (int num : nums){
            if(num>n) arr[n]++;
            else arr[num]++;
        }

        int total = 0;

        for(int i = n ; i >= 0 ; i--){
            total+=arr[i];
            if(total == i) return i ;
        }

        return -1 ;
    }
}