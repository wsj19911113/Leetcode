/*
	976. Middle of the linked list
	set fast and slow pointers, when fast pointer reaches end, the slow one much point to the middle one
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//use array to store the node and return array[length/2]
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] nodes = new ListNode[100];
        int i = 0;
        while(head != null){
            nodes[i++] = head;
            head = head.next;
        }
        return nodes[i/2];
    }
}

//use slow and fast pointers
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}