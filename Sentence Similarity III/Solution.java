class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
      
        String[] st1 = sentence1.split(" ");
        String[] st2 = sentence2.split(" ");

        if (st1.length > st2.length) {
            String[] temp = st1;
            st1 = st2;
            st2 = temp;
        }

        int n = st1.length, m = st2.length;
        int i = 0, j = 0;

        while (i < n && st1[i].equals(st2[i])) i++;
        while (j < n - i && st1[n - 1 - j].equals(st2[m - 1 - j])) j++;

        return i + j == n;

    }
}