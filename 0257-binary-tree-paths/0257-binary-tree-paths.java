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

    List<String> node = new ArrayList<>();
    List<String> paths = new ArrayList<>();
    void find_paths(TreeNode ptr)
    {
        if(ptr == null)return;
        node.add(Integer.toString(ptr.val));
        if(ptr.left == null && ptr.right == null)
        paths.add((String.join("->",node)));
        find_paths(ptr.left); 
        find_paths(ptr.right);
        node.remove(node.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        find_paths(root);
        return paths;

    }
}