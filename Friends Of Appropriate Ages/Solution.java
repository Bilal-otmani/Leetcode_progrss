class Solution {
    public int numFriendRequests(int[] ages) {
       int[] cnt = new int[121];
       for(int a : ages) cnt[a]++;

       int res = 0;

       for(int a = 1 ; a < 121 ; a++ ){
         if(cnt[a] == 0) continue;
         for(int b = 1 ; b <= a ; b++ ){
            if(cnt[b] == 0) continue;
            if(b <= a*0.5 + 7) continue ;

            if(a==b) res+=cnt[a]*(cnt[a]-1);
            else res +=cnt[a]*cnt[b];
         }
       }

       return res;
    }
}