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
        // null
        // r
        // null 1 2 3
        // h
        // 1, 2, 3
        //          l      
        // 4, 5, 6
        // r
        
        // linkedlist 문제는 curr, prev만 있으면 되는구나
        // 전체 리스트를 저장할 root가 필요함
        ListNode root = new ListNode();
        ListNode head = root; 
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        head.next = list1 == null ? list2 : list1;
        
        return root.next;
        
        
    }
}