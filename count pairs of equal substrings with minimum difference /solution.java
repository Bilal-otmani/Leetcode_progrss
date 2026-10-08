public class Solution {
    public int countQuadruples(String firstString, String secondString) {
        int[] first = new int[26];
        int[] last = new int[26];
        java.util.Arrays.fill(first, -1);
        java.util.Arrays.fill(last, -1);

        for(int i = 0 ; i<firstString.length();i++){
            int c = firstString.charAt(i) - 'a';
            if(first[c] == -1){
                first[c] = i;
        }}

         for (int i = 0; i < secondString.length(); i++) {
            int c = secondString.charAt(i) - 'a';
            last[c] = i;
        }


        int minDiff = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0 ; i<26 ; i++){
            if(first[i]==-1 || last[i]==-1) continue;
            int diff = last[i] - first[i];
            if(diff < minDiff){
                minDiff = diff;
                count = 1;
            } else if(diff == minDiff){
                count++;
            }
        }
        return count;
    }
}