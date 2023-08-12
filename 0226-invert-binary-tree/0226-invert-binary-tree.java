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
    
        //    ans     root
        //.    4       4
    //.      7        2.  7
    //.             13.  69
    
    
    //          4
    //        7
    //.      9
    
    
        //    4
        //   2 7
        //  13 69
        
        //.   4
        //.  7 2
        //. 69 13
        
        //   4
        //  2 7
        // 96 31
        
    
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode ans = new TreeNode(root.val);
        ans.left = invertTree(root.right);
        ans.right = invertTree(root.left);
        
        
        return ans;
    }
}