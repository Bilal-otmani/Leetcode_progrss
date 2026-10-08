class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            balance += (s.charAt(i) == 'L') ? 1 : -1;
            if (balance == 0) count++;
        }

        return count;
    }
}