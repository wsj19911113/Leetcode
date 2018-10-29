/*
    876. Middle of the linked List
    starting from head, if fast.next != null, there are odd number of nodes in the List
    if fast.next.next != null, there are even number of nodes in the list
*/

public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null){
            return slow;
        } else {
            return slow.next;
        }
    }
}