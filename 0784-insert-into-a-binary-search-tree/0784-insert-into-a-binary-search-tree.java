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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null)
        {
            root = newNode;
            return root;
        }
        TreeNode ptr = root;
        while(ptr!=null)
        {
            if(ptr.val < val)
            {
                if(ptr.right==null)
                {
                    ptr.right = newNode;
                    break;
                }
                ptr = ptr.right;
            }

            else
            {
                if(ptr.left==null)
                {
                    ptr.left = newNode;
                    break;
                }
                ptr = ptr.left;
            }
        }
        return root;
    }
}