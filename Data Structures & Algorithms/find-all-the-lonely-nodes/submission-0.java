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
    public List<Integer> getLonelyNodes(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if( root != null) 
            stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left == null && node.right != null) {
                res.add(node.right.val);
            }
            if(node.right == null && node.left != null) {
                res.add(node.left.val);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            } 
        }
        return res;
    }
}
