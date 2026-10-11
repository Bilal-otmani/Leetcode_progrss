class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> lst = new ArrayList<>();

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (lst.isEmpty() || lst.get(lst.size() - 1) != nums1[i]) {
                    lst.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] res = new int[lst.size()];
        for (int idx = 0; idx < res.length; idx++) res[idx] = lst.get(idx);
        return res;
    }
}