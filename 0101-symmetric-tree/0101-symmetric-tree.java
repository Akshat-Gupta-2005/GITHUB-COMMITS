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
    boolean rec(TreeNode l , TreeNode r){
        if (l == null || r == null) return l == r;
        return l.val == r.val && rec(l.left , r.right) && rec(l.right , r.left);
        }
    public boolean isSymmetric(TreeNode root) {
        return rec(root.left , root.right);
    }
}