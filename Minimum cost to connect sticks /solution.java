import java.util.*;

class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int s : sticks) {
            pq.add(s);
        }

        int total = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int cost = first + second;
            total += cost;          

            pq.add(cost);
        }

        return total;
    }
}