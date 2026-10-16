class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int m = arr[(n - 1) / 2];

        int[] res = new int[k];
        int i = 0, j = n - 1;

        for (int t = 0; t < k; t++) {
            if (Math.abs(arr[j] - m) >= Math.abs(arr[i] - m)) {
                res[t] = arr[j--];
            } else {
                res[t] = arr[i++];
            }
        }
        return res;
    }
}