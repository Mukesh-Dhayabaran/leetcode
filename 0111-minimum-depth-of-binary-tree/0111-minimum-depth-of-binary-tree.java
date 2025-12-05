/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min_depth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        depth(root, 0);
        return min_depth;
    }

    int depth(TreeNode root, int count) {
        if (root == null) return min_depth;     
        count++;
        if (root.left == null && root.right == null) {
            min_depth = Math.min(min_depth,count);
            return count;
        }

        int left = depth(root.left,count);
        int right = depth(root.right,count);

        return Math.min(left,right);      
    }
}
