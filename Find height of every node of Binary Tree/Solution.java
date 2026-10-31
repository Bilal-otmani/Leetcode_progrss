public class Solution {

    static class Node{
        int val ;
        Node right , left;
        public Node(int val){this.val = val;}
    }

     static int computeHeights(Node root, Map<Node, Integer> heights) {
        if (root == null) return -1;

        int leftHeight = computeHeights(root.left, heights);
        int rightHeight = computeHeights(root.right, heights);

        int height = 1 + Math.max(leftHeight, rightHeight);
        heights.put(root, height);
        return height;
    }
}