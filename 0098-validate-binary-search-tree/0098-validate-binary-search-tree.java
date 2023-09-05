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
    public boolean isValidBST(TreeNode root) {
        // 문제는 root.left가 null일 수도 있다..
        // 만약 isValidBST(root, root.left) || isValidBST(root, root.right)로 분기하면 왼쪽과 오른쪽의 로직을 다르게 할 수 없다
        // 그래서 primitive 타입으로 전달한다
        
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    // BFS,DFS의 핵심은 inorder, preorder, postorder를 선택하는 것이다
    private boolean isValid(TreeNode root, long min, long max) {
        //    1
        // 5     4
        //n n.  3. 6
        // 1 min max
        // 5 min 1 -> false
        // 4 1   max
        // 3 1   4
        // n 1   3 -> true
        // 6 4   max
        // n 4   6 -> true
        
        if(root == null) return true;
        if(root.val >= max || root.val <= min) return false;
        
        // root가 min과 max 2가지로 표현되어서, 참조값에 대한 한계를 극복
        // left는 max보다 작아야 한다
        // right은 min보다 커야 한다
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max); // 둘중에 하나라도 false면 false를 반환해야 한다
        
        
    }
    
    
}