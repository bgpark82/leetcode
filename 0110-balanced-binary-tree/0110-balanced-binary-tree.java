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
    
    // 일단 답을 저장하고, traversal하는게 많은 듯
    private boolean ans = true;
    
    public boolean isBalanced(TreeNode root) {
        height(root);
        return ans;
    }
    
    // traversal의 결과가 중요하지는 않다. 과정 중에 답을 찾으면 그만
    private int height(TreeNode node) {
        if (node == null) return 0;
        
        int l = height(node.left);
        int r = height(node.right);
        
        if(Math.abs(l - r) > 1) ans = false;
        
        return Math.max(l, r) + 1;
        
    }
}