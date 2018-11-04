/*
    725. Split Linked List in Parts
*/

class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode current = root;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        
        ListNode[] result = new ListNode[k];
        current = root;
        int size = length / k;
        int remainder = length % k;
        for(int i = 0; i < k; i++){
        	if(current == null) {
        		result[i] = null;
        		continue;
        	}
            result[i] = current;
            int j = 1;
            int s = size;
            if(remainder > 0){
                s++;
            }
            while(current.next != null && j < s){
                current = current.next;
                j++;
            }
            ListNode temp = current.next;
            current.next = null;
            current = temp;
            remainder--;
        }
        return result;
    }
}


class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode current = root;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        
        ListNode[] result = new ListNode[k];
        current = root;
        int size = length / k;
        int remainder = length % k;
        for(int i = 0; i < k; i++){
            ListNode head = new ListNode(0);
            ListNode write = head;
            for(int j = 0; j < size + (remainder > 0 ? 1: 0); j++){
                if(current != null){
                    write.next = new ListNode(current.val);
                    current = current.next;
                }
                write = write.next;
            }
            remainder--;
            result[i] = head.next;
        }
        return result;
    }
}