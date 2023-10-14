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
    
    private int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }
    
    private int dfs(TreeNode node) {
        if(node == null) return 0;
        
        // 4인 경우, l=0,r=0
        // 2인 경우, l=1,r=1
        // 1인 경우, l=2,r=1
        int left = dfs(node.left);
        int right = dfs(node.right);
        
        // 현재 노드에서 왼쪽과 오른쪽의 길이의 합이 최대치인 것
        diameter = Math.max(diameter, left + right);
        
        // 부모 노드로 올라갈때 왼쪽과 오른쪽 중 가장 긴 값을 선택한다
        return Math.max(left, right) + 1;
    }
    
    
//     // what to find
//     private int diameter = 0;
    
//     public int diameterOfBinaryTree(TreeNode root) {
//         dfs(root);
//         return diameter;
//     }
    
//     // each node (snapshot)
//     private int dfs(TreeNode node) {
//         if(node == null) return 0;
        
//         int left = dfs(node.left);
//         int right = dfs(node.right);
        
//         // update target value in every traversal
//         diameter = Math.max(diameter, left + right);
        
//         return Math.max(left, right) + 1;
//     }
}