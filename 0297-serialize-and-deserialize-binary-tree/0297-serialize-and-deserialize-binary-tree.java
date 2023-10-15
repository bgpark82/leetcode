/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // 1
        // 2 3
        // null null 4 5
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    private void dfs(TreeNode node, StringBuilder sb) {
        if(node == null) {
            sb.append("null").append(",");
        } else {
            sb.append(node.val).append(",");
            dfs(node.left, sb);
            dfs(node.right, sb);
        }
    }
    
    int index = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        // 
        return tree(arr);
    }
    
    private TreeNode tree(String[] arr) {
        if(index >= arr.length || arr[index].equals("null")) return null;
        
        TreeNode node = new TreeNode(Integer.valueOf(arr[index]));
        index++;
        node.left = tree(arr);
        index++;
        node.right = tree(arr);
        return node;           
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));