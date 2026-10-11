class Solution {
    public int minSteps(int n) {
        int total = 0;

        while (n % 2 == 0) {
            total += 2;
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                total += i;
                n /= i;
            }
        }

        if (n > 1) total += n;

        return total;
    }
}