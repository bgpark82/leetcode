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
    
//     public int rangeSumBST(TreeNode root, int low, int high) {
            
//         if(root == null) return 0;
        
        
//         if(root.val < low) return rangeSumBST(root.right, low, high);
        
//         // 현재 노드가 low보다 작지 않고 high보다 작으면
//     }
    
    
    int sum = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 7 ~ 15
        //   10    equal -> sum
        //  5      less -> right
        //.   7.   eqaul -> sum
        dfs(root, low, high);
        return sum;
    }
    
    private void dfs(TreeNode node, int low, int high) {
        if(node == null) return;
        
        if(node.val < low) dfs(node.right, low, high);
        else if(node.val > high) dfs(node.left, low, high);
        else {
            sum += node.val;
            dfs(node.left, low, high);
            dfs(node.right, low, high);
        }
    }
}