class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
       int[] count = new int[101];
        int size = 0;

        for (int i = 0; i < nums.length; i++) count[nums[i]]++;

        for (int i = 0; i < 101; i++) {
            size += Math.min(count[i], k);
        }

        int[] arr = new int[size];
        int idx = 0;

        for (int v = 0; v < 101; v++) {
            int times = Math.min(count[v], k);
            for (int t = 0; t < times; t++) {
                arr[idx++] = v;
            }
        }

        return arr;
    }
}