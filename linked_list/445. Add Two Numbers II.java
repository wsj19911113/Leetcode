/*
    445. Add Two Numbers II
    create stacks for storing the numbers
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l2 == null) return l1;
        if(l1 == null) return l2;
        
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> sum = new Stack<Integer>();
        
        while(l1 != null){
            a.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            b.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0;
        while(!a.isEmpty() || !b.isEmpty()){
            int x = a.isEmpty() ? 0 : a.pop();
            int y = b.isEmpty() ? 0 : b.pop();
            int s = x + y + carry;
            sum.push(s % 10);
            carry = s/10;
        }
        if(carry > 0) sum.push(carry);
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(!sum.isEmpty()){
            current.next = new ListNode(sum.pop());
            current = current.next;
        }
        return dummy.next;
    }
}