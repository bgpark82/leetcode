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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //.           p1
        // list1: 1 2 4
        // list2: 1 3 4
        //.           p2
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode ans = new ListNode(1);
        ListNode head = ans;
        
        while(p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                head.next = p1;
                head = head.next;
                p1 = p1.next;
            } else {
                head.next = p2;
                head = head.next;
                p2 = p2.next;
            }
        }
        while(p1 != null) {
            head.next = p1;
            head = head.next;
            p1 = p1.next;
        }
        while(p2 != null) {
            head.next = p2;
            head = head.next;
            p2 = p2.next;
        }
        
        
        return ans.next;
        
    }
}