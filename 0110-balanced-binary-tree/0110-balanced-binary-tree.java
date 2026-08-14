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
    int rec(TreeNode n){
        if (n == null) return 0;
        int l = rec(n.left);
        if (l == -1) return -1;
        int r = rec(n.right);
        if (r == -1) return -1;
        if (Math.abs(l-r) > 1) return -1;
        return Math.max(l,r) + 1; 

    }
    public boolean isBalanced(TreeNode root) {
        return rec(root)!=-1;
    }
}