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
    
    //.        10
    //.    5.        15
    //. 3.    7.          18
    //1.  4      8. 
    // 8 ~ 18
    
    // 1. if it is 5, we don't need to move to left at all
    //        10
    //    5        15
    //       7          18
    //         8. 
    
    // 10 + 8 + 15 + 18
    
    
    // return sum of value of node ranging between low and hight (inclusive)
    // sum of left and right is the answer
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0; // if there is no value nothing to sum
        
        // these branches out in specific condition
        if(root.val < low) return rangeSumBST(root.right, low, high); // 1. don't need to move to left at all
        if(root.val > high) return  rangeSumBST(root.left, low, high);
        // if it within range
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}