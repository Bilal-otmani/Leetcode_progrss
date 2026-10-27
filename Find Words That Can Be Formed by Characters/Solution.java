class Solution {
    public int countCharacters(String[] words, String chars) {

        int available[] = new int[26];
        for(char c : chars.toCharArray()){
            available[c-'a']++;
        }
           
        int total = 0;

        for(String word : words){
            int need[] = new int[26];
             for (char c : word.toCharArray()) {
                need[c - 'a']++;
            }

            boolean good = true ;
            
            for(int i = 0 ; i < 26 ; i++){
                if(need[i]>available[i]){
                    good = false;
                    break;
                }
            }

            if (good) total+=word.length();
        }

        return total;
    }
}