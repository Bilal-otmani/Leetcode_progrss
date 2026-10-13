
public class Solution {

    public static int[] predictAnswer(int[] stockData, int[] queries) {
        int n = stockData.length;
        int[] left = new int[n];   
        int[] right = new int[n];  

       
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            while (top >= 0 && stockData[stack[top]] >= stockData[i]) {
                top--;
            }
            left[i] = (top >= 0) ? stack[top] : -1;
            stack[++top] = i;
        }

     
        top = -1;
        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && stockData[stack[top]] >= stockData[i]) {
                top--;
            }
            right[i] = (top >= 0) ? stack[top] : -1;
            stack[++top] = i;
        }

        int[] result = new int[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int i = queries[k] - 1;   
            int l = left[i];
            int r = right[i];

            if (l == -1 && r == -1) {
                result[k] = -1;
            } else if (l == -1) {
                result[k] = r + 1;
            } else if (r == -1) {
                result[k] = l + 1;
            } else {
                int distL = i - l;
                int distR = r - i;
                
                result[k] = (distL <= distR) ? l + 1 : r + 1;
            }
        }
        return result;
    }

}