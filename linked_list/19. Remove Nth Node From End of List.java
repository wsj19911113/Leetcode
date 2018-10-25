/*
    19. Remove Nth Node From End of List
    remember to consider remove the first node
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


//14ms, 17.95%
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode current = head;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        int steps = length - n;
        
        current = head;
        if(steps == 0){
            return head.next;
        }
        int index = 1;
        while(index < steps){
            current = current.next;
            index++;
        }
        current.next = current.next.next;
        
        return head;
    }
}

//one pass solution
//10ms 54.73%
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null || head.next == null) return null;
    ListNode fast = head;
    ListNode slow = head;
    int index = 0;
    while(index < n){
        fast = fast.next;
        index ++;
    }
    if(fast == null) return head.next;
    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }
    slow.next = slow.next.next;
    
    return head;
}