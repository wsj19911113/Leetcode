/*
    234. Palindrome Linked List
    find the middle point using slow/fast pointers, then cut the list into two(so we don't have to deal with the odd/even cases)
    flip the second list and then compare node by node
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode previous = null;
        ListNode current = slow.next;
        slow.next = null;
        
        while(current != null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        
        while(previous != null && head != null){
            if(previous.val != head.val) return false;
            previous = previous.next;
            head = head.next;
        }
        return true;
    }
}