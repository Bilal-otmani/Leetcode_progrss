class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int [100];
        int pairs = 0;
        for(int[] d : dominoes){
            int min = Math.min(d[0],d[1]);
            int max = Math.max(d[0],d[1]);
            int key = min*10 + max ;

            pairs+=count[key];
            count[key]++;

        }

        return pairs;
    }
}