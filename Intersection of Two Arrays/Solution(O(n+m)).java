class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> hash1 = new HashSet<>();
     Set<Integer> res = new HashSet<>();

     for(int el : nums1) hash1.add(el);
     for(int el : nums2){
        if(hash1.contains(el)) res.add(el);
         }
     int[] result = new int [res.size()];
     int k = 0 ;
     for(int el : res) result[k++] = el ;

     return result;   
    }
}