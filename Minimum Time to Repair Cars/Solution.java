class Solution {
    public long repairCars(int[] ranks, int cars) {
        int minr = Integer.MAX_VALUE;
        for (int el : ranks) minr = Math.min(minr, el);

        long l = 0;
        long r = (long) minr * cars * cars;

        while (l < r) {
            long mid = l + (r - l) / 2;
            if (isEnough(mid, ranks, cars)) r = mid;   
            else l = mid + 1;                          
        }
        return l;
    }

    private boolean isEnough(long time, int[] ranks, int cars) {
        long c = 0;
        for (int rank : ranks) {
            long n = (long) Math.sqrt(time / rank);   
            c += n;
            if (c >= cars) return true;               
        }
        return c >= cars;
    }
}