/*
    92. reverse linked list II
*/

public ListNode reverseBetween(ListNode head, int m, int n) {
    if(head == null || head.next == null) return head;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode start = dummy;
    int index = 1;
    ListNode current = dummy.next;
    while(index < m){
        start = current;
        current = current.next;
        index++;
    }
    ListNode previous = start.next;
    if(previous.next == null) {
        return head;
    }
    current = current.next;
    ListNode temp = current.next;
    while(index < n){
        temp = current.next;
        current.next = previous;
        previous = current;
        current = temp;
        index++;
    }
    start.next.next = temp;
    start.next = current;
    return dummy.next;
}