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
    boolean rec(TreeNode t, Long l , Long r){
        if (t == null) return true;
        return t.val>l && t.val<r && rec(t.left,l,(long)t.val) && rec(t.right,(long)t.val,r);
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null ) return true;
        return rec(root, Long.MIN_VALUE , Long.MAX_VALUE);
        
    }
}