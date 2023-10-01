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
        // n 1 2 3 4 5
        //     c
        //   p
        // c.next = pre
        
        
        return dfs(head, null);        
    }
    
    // n 1 2 3 4 5
    //           c
    //         p
    ListNode dfs(ListNode curr, ListNode pre) {
        if(curr == null) return pre;
        
        ListNode next = curr.next;
        curr.next = pre;
        return dfs(next, curr);
    }
}