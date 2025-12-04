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
    int max_depth = 0;
    public int maxDepth(TreeNode root) {
        depth(root,0);
        return max_depth;
    }

    public void depth(TreeNode root, int count) {
        if(root == null)
        {
            max_depth = Math.max(count,max_depth);
            return;
        }
        count++;
        depth(root.left,count);
        depth(root.right,count);
        return ;
    }
}