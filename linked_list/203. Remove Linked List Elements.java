/*
    203. Remove Linked List Elements
    remember to remove all matching nodes in the list
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = head;
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                if(current == head){
                    head = head.next;
                    previous = current;
                } else if(current.next == null){
                    previous.next = null;
                } else {
                    previous.next = current.next;
                }
            } else {
                previous = current;
            }
            current = current.next;
        }
        return head;
    }
}