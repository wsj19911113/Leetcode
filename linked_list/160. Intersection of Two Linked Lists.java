/*
    160. Intersection of Two Linked Lists
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int sizeA = 1, sizeB = 1;
        ListNode tempA = headA, tempB = headB;
        while(tempA != null){
            sizeA ++;
            tempA = tempA.next;
        }
        while(tempB != null){
            sizeB ++;
            tempB = tempB.next;
        }
        if(sizeA > sizeB){
            for(int i = 0; i<sizeA-sizeB; i++){
                headA = headA.next;
            }
        } else if(sizeB > sizeA){
            for(int i = 0; i<sizeB-sizeA; i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA.val == headB.val){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}