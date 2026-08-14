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
    public static void preOrder(TreeNode node , List <Integer> l){
        if (node == null){
            return;
        }

        l.add(node.val);
        preOrder(node.left,l);
        preOrder(node.right,l);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> l = new LinkedList<>();
        if (root == null) return l;
        // preOrder(root,l);
        Stack <TreeNode> s = new Stack<>();
        s.push(root);

        while(!s.isEmpty()){
            TreeNode n = s.pop();
            l.add(n.val);
            if (n.right != null) s.push(n.right);
            if (n.left != null) s.push(n.left);
        }
        return l;
    }
}