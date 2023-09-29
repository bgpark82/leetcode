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
    
    private List<Integer> list = new ArrayList();
    
    public int kthSmallest(TreeNode root, int k) {        
        // inorder 순서대로
        // 1 2 3 4
        dfs(root);
        
        
        return list.get(k - 1);
        
        
    }
    
    private void dfs(TreeNode node) {
        if(node == null) return;
        
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
    
//     public int kthSmallest(TreeNode root, int k) {
        
//         Set<Integer> set = new TreeSet();
    
//         Deque<TreeNode> queue = new ArrayDeque();
//         queue.addLast(root);
        
//         while(!queue.isEmpty()) {
            
//             TreeNode node = queue.removeFirst();
            
//             set.add(node.val);
            
//             if(node.left != null) queue.addLast(node.left);
//             if(node.right != null) queue.addLast(node.right);
//         }
        
//         for(Integer s : set) {
//             System.out.print(s + " ");
//         }
        
//         int i = 1;
//         for(Integer s : set) {
//             if(i++ == k) {
//                 return s;
//             }
//         }
//         return -1;
//     }
}