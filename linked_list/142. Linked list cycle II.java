/*
    142. Linked list cycle II
    https://www.cnblogs.com/hiddenfox/p/3408931.html
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        }
        
        ListNode z = slow;
        ListNode x = head;
        while(z != x){
            z = z.next;
            x = x.next;
        }
        
        return x;
    }
}