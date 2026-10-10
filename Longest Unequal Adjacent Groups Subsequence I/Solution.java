class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int last = 0 , start = 1;
        List<String> lst = new ArrayList<>();
        lst.add(words[0]);
        while(start<groups.length){
              if(groups[start] == groups[last])lst.add(words[start]);
              start++;last++;
        }
        return lst;
    }
}