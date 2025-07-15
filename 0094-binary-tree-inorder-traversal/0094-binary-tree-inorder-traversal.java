class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

        public static void preorder(TreeNode node,List<Integer> list)
        {
            if(node == null)
            return;

            preorder(node.left,list);
            list.add(node.val);
            preorder(node.right,list);
        }

}