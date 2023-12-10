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
        
        // LinkedList는 constant space를 쓰기 위해 사용한다
        // 데이터 구조에 대한 이해가 많이 없는게 아닐까...?
        // head는 움직여야 되므로 어딘가 저장해야 한다
        
        
        // 시작값을 -1에서 시작, 더미를 잘 써야 한다. 더미는 head와 별개로 동작하기 위해서 별로도 iterate한다 (캐싱)
        ListNode dummy = new ListNode(0, head);
        
        ListNode fast = head, slow = dummy;
        while(n-- > 0) fast = fast.next;
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}