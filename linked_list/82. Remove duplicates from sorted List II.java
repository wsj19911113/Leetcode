/*
    82. Remove duplicates from sorted List II
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode current = head;
        ListNode previous = dummy;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                int temp = current.val;
                while(current != null && current.val == temp){
                    current = current.next;
                    previous.next = previous.next.next;
                }
            } else {
                current = current.next;
                previous = previous.next;
            }
        }
        return dummy.next;
    }
}