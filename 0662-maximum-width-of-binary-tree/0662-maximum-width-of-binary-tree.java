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

class P{
    int l;
    TreeNode t;
    P(int l , TreeNode t){
        this.l = l;
        this.t = t;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<P>q = new LinkedList<>();
        q.add(new P(0,root));
        int max = 0;

        while(!q.isEmpty()){
            P p = q.peek();
            TreeNode t = p.t;
            int l = p.l;

            int s = q.size();

            for (int i = 0 ; i < s ; i++){
                P p2 = q.poll();
                max = Math.max(max, p2.l - l + 1);
                if (p2.t.left != null) q.add(new P(2 * p2.l , p2.t.left ));
                if (p2.t.right != null) q.add(new P(2 * p2.l +1 , p2.t.right ));
            }
        }

        return max;
    }
}