/*
    21. Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode head = null;
        ListNode node = null;
        
        while(l1 != null && l2 != null){
            if(node == null){
                if(l1.val < l2.val){
                    node = l1;
                    l1 = l1.next;
                } else {
                    node = l2;
                    l2 = l2.next;
                }
                head = node;
            } else {
                if(l1.val < l2.val){
                    node.next = l1;
                    l1 = l1.next;
                } else {
                    node.next = l2;
                    l2 = l2.next;
                }
                node = node.next;
            }
            
            if(l1 != null){
                node.next = l1;
            }
            if(l2 != null){
                node.next = l2;
            }
        }
        
        return head;
    }
}