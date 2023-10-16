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
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val < low) return rangeSumBST(root.right, low, high);
        if(root.val > high) return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
    
    // 10 + 7 + 15
    
    
//     int sum = 0;
    
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         // 7 ~ 15
//         //   10    equal -> sum
//         //  5      less -> right
//         //.   7.   eqaul -> sum
//         dfs(root, low, high);
//         return sum;
//     }
    
//     private void dfs(TreeNode node, int low, int high) {
//         if(node == null) return;
        
//         if(node.val < low) dfs(node.right, low, high);
//         else if(node.val > high) dfs(node.left, low, high);
//         else {
//             sum += node.val;
//             dfs(node.left, low, high);
//             dfs(node.right, low, high);
//         }
//     }
}