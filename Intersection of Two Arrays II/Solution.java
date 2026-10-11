class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         if (nums1.length > nums2.length) return intersect(nums2, nums1);

         Map<Integer , Integer> map = new HashMap<>();

         for(int el : nums1) map.put(el,map.getOrDefault(el,0)+1);

         int[] res = new int[nums1.length];
        int k = 0;
         for(int el : nums2){
            int c = map.getOrDefault(el,0);
            if(c > 0){
                res[k++] = el ;
                map.put(el , c-1);
            }
         }

        return  Arrays.copyOf(res,k);
    }
}