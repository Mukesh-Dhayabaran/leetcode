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
    public TreeNode bstToGst(TreeNode root) {
        RPL(root,0);
        return root;
    }

    int RPL(TreeNode root,int sum)
    {
        if(root == null) return sum;
        int right = RPL(root.right,sum);
        root.val += right;
        int left = RPL(root.left,root.val);
        return left;
    }
}