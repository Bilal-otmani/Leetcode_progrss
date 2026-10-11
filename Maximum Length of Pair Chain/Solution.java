class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));

        int count = 0 ;
         int curEnd = Integer.MIN_VALUE;

        for(int [] p : pairs ){
            if(p[0]>curEnd){
                count++;
                curEnd=p[1];
            }
        }

        return count ;
    }
}