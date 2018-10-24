/*
    86. Partition List
    create two linked list and connect them together
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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode bigHead = new ListNode(0);
        ListNode big = bigHead;
        
        while(head != null){
            ListNode temp = new ListNode(head.val);
            if(head.val < x){
                small.next = temp;
                small = small.next;
            } else {
                big.next = temp;
                big = big.next;
            }
            head = head.next;
        }
        small.next = bigHead.next;
        return smallHead.next;
    }
}

//solution 2: 注意start point边界处理

class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
		ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode previous=dummy;
        ListNode current=head;
        ListNode pointer=null;
        while(current!=null){
            if(current.val>=x && pointer==null){
            	pointer=previous;
            }
            if(current.val<x && pointer!=null){
            	previous.next=current.next;
            	current.next=pointer.next;
            	pointer.next=current;
            	pointer=pointer.next;
                current=previous.next;
            } else {
                previous=previous.next;
                current=current.next;
            }
        }
        return dummy.next;
    }
}