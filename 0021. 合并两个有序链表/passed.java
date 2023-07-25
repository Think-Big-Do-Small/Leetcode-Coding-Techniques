/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (null == list1) return list2; 
        if (null == list2) return list1; 
        ListNode l1 = list1;
        ListNode l2 = list2; 
        ListNode l3 = null; 
        /* assign new head */
        if (l1.val < l2.val) {
            l3 = l1; l1 = l1.next; 
        } else {
            l3 = l2; l2 = l2.next; 
        }
        ListNode l3Mov = l3; 
        /* move to next */
        while ((null != l1) && (null != l2)) {
            if(l1.val < l2.val) {
                l3Mov.next = l1; l3Mov = l3Mov.next; l1 = l1.next;
            } else {
                l3Mov.next = l2; l3Mov = l3Mov.next; l2 = l2.next; 
            }
        }
        while (null != l1) {
            l3Mov.next = l1; l3Mov = l3Mov.next; l1 = l1.next;
        }
        while (null != l2) {
            l3Mov.next = l2; l3Mov = l3Mov.next; l2 = l2.next; 
        }
        l3Mov.next = null; 
        return l3; 
    }
}