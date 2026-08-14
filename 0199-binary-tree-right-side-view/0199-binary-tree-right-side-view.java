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
    void rec(TreeNode t, int  n , List<Integer> l){
        if (t == null) return; 
        if (n == l.size()) l.add(t.val);
        rec(t.right , n+1 , l);
        rec(t.left, n+1 , l);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        rec(root,0,l);
        return l;
    }
}