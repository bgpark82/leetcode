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
    
    //   1
    // 2  3
    
    List<Integer> list = new ArrayList();
    
    public List<Integer> rightSideView(TreeNode root) {
        // it can be left node
        // iterate each level, find the most right node
        
        if(root == null) return list;
        
        Deque<TreeNode> queue = new ArrayDeque();
        queue.addLast(root);
        
        while(!queue.isEmpty()) {
            // iterate nodes in the same level
            // save the size, and iterate as much as its size
            // initial size is the number of node in the same level
            int size = queue.size();
            
            int val = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.removeFirst();    
                val = node.val;
                
                if(node.left != null) queue.addLast(node.left);
                if(node.right != null) queue.addLast(node.right);
            }
            
            list.add(val);
        }
        
        return list;
        
    }
    
}