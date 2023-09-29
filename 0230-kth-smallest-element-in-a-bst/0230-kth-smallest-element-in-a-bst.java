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
    public int kthSmallest(TreeNode root, int k) {
     
        // 1
        //    3
        //  1.  4
        //.   2
        
        // first solution
        // iterate bst
        // save treemap
        // return nth value
        // nlogn
        
        Set<Integer> set = new TreeSet();
        
    
        Deque<TreeNode> queue = new ArrayDeque();
        queue.addLast(root);
        
        while(!queue.isEmpty()) {
            
            TreeNode node = queue.removeFirst();
            
            set.add(node.val);
            
            if(node.left != null) queue.addLast(node.left);
            if(node.right != null) queue.addLast(node.right);
        }
        
        for(Integer s : set) {
            System.out.print(s + " ");
        }
        
        int i = 1;
        for(Integer s : set) {
            if(i++ == k) {
                return s;
            }
        }
        return -1;
        
    }
}