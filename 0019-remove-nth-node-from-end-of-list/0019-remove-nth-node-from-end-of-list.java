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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //  1 2 3 4 5
        //    f        
        //
        
        //   1 2 3 4 5
        //     f        
        // s
        
        //   1 2 3 4 5
        //           f        
        //       s
        
        
        // 시작값을 -1에서 시작
        ListNode ans = new ListNode(0, head);
        
        ListNode fast = head, slow = ans;
        while(n-- > 0) fast = fast.next;
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return ans.next;
    }
}