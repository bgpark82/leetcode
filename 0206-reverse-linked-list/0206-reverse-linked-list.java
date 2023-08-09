/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 1 -> 2 -> 3 -> 4 -> 5
        // c c
        // p
        
        
        // 1 2 3 4 5 6
        
        return dfs(head, null);        
    }
    
    // null 1 2 3 4 5
    // p    c
    //.     p c
    ListNode dfs(ListNode curr, ListNode pre) {
        // 마지막 노드면 이전 노드로 이동
        if (curr == null) return pre;
        // 다음 노드를 현재 노드로 변경
        ListNode next = curr.next;
        // 현재 노드의 다음 노드를 pre로 변경
        curr.next = pre;
        return dfs(next, curr);
    }
}