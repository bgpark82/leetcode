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
                p1 = p1.next;
            } else {
                head.next = p2;
                p2 = p2.next;
            }
            head = head.next;
        }
        
        // 아래 while문 2개와 아래 코드는 똑같다
        // 즉, p1이 null이면 p2는 아직 다 돌지 못한 상태이다
        // p1과 p2는 순서대로 정렬되어 있으므로 head에 연결시키기만 하면 된다
        head.next = p1 == null ? p2 : p1;
        
//         while(p1 != null) {
//             head.next = p1;
//             head = head.next;
//             p1 = p1.next;
//         }
//         while(p2 != null) {
//             head.next = p2;
//             head = head.next;
//             p2 = p2.next;
//         }
        
        
        return ans.next;
        
    }
}