/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // bst의 특징을 이용하는 문제
        // 부모 노드의 왼쪽과 오른쪽의 크기가 다르다
        // 왼쪽 자식 노드는 부모 노드보다 작은 값
        // 오른쪽 자식 노드는 부모 노드보다 큰 값
        // 만약 p,q의 값이 부모 노드보다 크다면, 노드를 오른쪽으로 이동 시켜야 한다
        // 만약 p,q의 값이 부모 노드보다 작다면, 노드를 왼쪽으로 이동 시켜야 한다
        // 그럼 언제 리턴해야하나
        // 부모 노드 시점에서 리턴해야 한다
        
        
        // 근데 bst가 아니네
        
        // 현재 노드가 타겟보다 크면 왼쪽 노드로 이동한다
        
        // 노드 이
        // 결국 p, q 중 하나만 일치해도 해당 노드가 가장 최상위 노드가 된다
        
        // q, p 중 하나의 값이 root 노드와 동일한 경우, 반환한다
        // 만약 root 아래에 p, q에 일치하는 값이 있어도 의미가 없다. 그냥 해당 노드가 최상위 노드이기 때문에 그냥 리턴하면 된다
        
        // [3,5,1,6,2,0,8,null,null,7,4]
        
        //    3
        //  5   1
        // 6 2 0 8
        //nn 74

        
        
        
        // base case
        if (root == null || root == p || root == q) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // 갔다온 후
        // if(left == null && right == null) return null;
        if(left != null && right != null) return root;
        return left == null ? right: left;
        
    }
}