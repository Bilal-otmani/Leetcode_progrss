class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int size = n; size > 1; size--) {

            int maxIdx = 0;
            for (int i = 1; i < size; i++) {
                if (arr[i] > arr[maxIdx]) maxIdx = i;
            }

            if (maxIdx == size - 1) continue;

            if (maxIdx != 0) {
                reverse(arr, maxIdx);
                result.add(maxIdx + 1);
            }

            reverse(arr, size - 1);
            result.add(size);
        }

        return result;
    }

    private void reverse(int[] arr, int end) {
        int i = 0, j = end;
        while (i < j) {
            int tmp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = tmp;
        }
    }
}