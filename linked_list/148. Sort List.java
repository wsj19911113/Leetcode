/*
    148. Sort List
    using merge sort
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        slow = head;
        
        ListNode l1 = sortList(slow);
        ListNode l2 = sortList(fast);
        return mergeList(l1, l2);
    }
    
    private ListNode mergeList(ListNode slow, ListNode fast){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(slow != null && fast != null){
            if(slow.val < fast.val){
                current.next = slow;
                slow = slow.next;
            } else {
                current.next = fast;
                fast = fast.next;
            }
            current = current.next;
        }
        if(slow != null){
            current.next = slow;
        }
        if(fast != null){
            current.next = fast;
        }
        return dummy.next;
    }
}