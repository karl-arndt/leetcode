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

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pointer = root;
        stack.push(root);

        while(!stack.isEmpty() && pointer != null) {
            TreeNode temp = pointer.right;
            pointer.right = pointer.left;
            pointer.left = temp;
            if (pointer.right != null) {
                stack.push(pointer.right);
            }
            pointer = pointer.left;
            if (pointer == null) {
                pointer = stack.pop();
            }
        }


        return root;
    }
}
