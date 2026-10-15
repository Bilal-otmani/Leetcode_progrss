class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;

        while (l < r) {
            if (c[l] != x) {
                l++;
            } else if (c[r] != y) {
                r--;
            } else {
                char tmp = c[l];
                c[l] = c[r];
                c[r] = tmp;
                l++;
                r--;
            }
        }

        return new String(c);
    }
}