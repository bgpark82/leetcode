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
    
    // return sum of value of node ranging between low and hight (inclusive)
    // sum of left and right is the answer
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0; // if there is no value nothing to sum
        
        // these branches out in specific condition
        // if value of node is less than low, move to node right and get answer (sum) of it
        if(root.val < low) return rangeSumBST(root.right, low, high);
        if(root.val > high) return  rangeSumBST(root.left, low, high);
        // if it within range
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}