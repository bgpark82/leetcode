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
    
    
    
    boolean ans = true;
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 3 4
        // 4 4 true
        // 1 1 true
        // 2 2 true
        // 0 n false
        
        // root를 iterate
        // root.val == sub.val -> 탐색
        // root.val != sub.val -> root 탐색
        if(subRoot == null) return true;
        if(root == null) return false;
        
        // 계속 탐색하다가 root와 sub의 값이 같으면 같은 트리인지 탐색
        if(dfs(root, subRoot)) return true;
        
        
        // 해당 경우가 아니면 계속 왼쪽 오른쪽 노드 탐색
        // 둘 중에 하나라도 같은 같은 노드이면 true를 반환할 예정
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private boolean dfs(TreeNode root, TreeNode sub) {
        
        if(root == null && sub == null) return true;
        
        if(root == null || sub == null || root.val != sub.val) return false;
        
        return dfs(root.left, sub.left) && dfs(root.right, sub.right);
    }
}