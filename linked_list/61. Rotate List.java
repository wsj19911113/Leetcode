/*
    61. Rotate List
    calculate the length, then mod the steps that is needed to the certain node
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode c = head;
        int length = 1;
        while(c.next != null){
            length++;
            c = c.next;
        }
        
        int steps = k % length;
        if(steps == 0) return head;
        
        c.next = head;
        c = head;
        steps = length - steps;
        int count = 1;
        
        while(count != steps){
            c = c.next;
            count++;
        }
        head = c.next;
        c.next = null;
        
        return head;
    }
}