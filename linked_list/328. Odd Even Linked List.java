/*
    328. Odd Even Linked List
*/

//6 ms 17.15%
//in-place re-connext
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next == null) return head;
        
        ListNode previous = head;
        ListNode current = head.next;
        
        while(current != null && current.next != null){
            ListNode temp = current.next.next;
            current.next.next = previous.next;
            previous.next = current.next;
            current.next = temp;
            current = temp;
            previous = previous.next;
        }
        return head;
    }
}

//4 ms 83.88%
//append every even number node to the end of the list
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        
        ListNode end = head;
        int length = 1;
        while(end.next != null){
            length ++;
            end = end.next;
        }
        
        ListNode previous = head;
        ListNode current = head.next;
        int index = 2;
        while(index <= length){
            if(index % 2 == 0){
                previous.next = current.next;
                current.next = end.next;
                end.next = current;
                end = end.next;
                previous = previous.next;
                current = previous.next;
            }
            index++;
        }
        
        return head;
    }
}