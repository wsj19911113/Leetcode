/*
    2. Add two numbers
    Keep track of the carry using a variable and simulate digits-by-digits sum starting from the head of list, which contains the least-significant digit.
    
    use dummyhead to start the list and return dummyhead.next as the start of the result
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode node = head;
        while(l1 != null || l2 != null){
            int x = (l1 == null) ? 0 : l1.val;
            int y = (l2 == null) ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            node.next = new ListNode(sum);
            node = node.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        if(carry > 0){
            node.next = new ListNode(carry);
        }
        return head.next;
    }
}