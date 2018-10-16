/*
	237. Delete Node in a Linked List

	The linked list will have at least two elements.
	All of the nodes' values will be unique.
	The given node will not be the tail and it will always be a valid node of the linked list.
	Do not return anything from your function.
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
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}