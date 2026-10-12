import java.util.*;

public class Solution {

    public static int getMaxPages(int[] pages, int[] threshold) {
        int n = pages.length;

    
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            groups.computeIfAbsent(threshold[i], k -> new ArrayList<>()).add(pages[i]);
        }

        long total = 0;
        for (Map.Entry<Integer, List<Integer>> e : groups.entrySet()) {
            int t = e.getKey();
            List<Integer> list = e.getValue();


            list.sort(Collections.reverseOrder());

            int take = Math.min(list.size(), t);
            for (int i = 0; i < take; i++) {
                total += list.get(i);
            }
        }
        return (int) total;
    }

   
}