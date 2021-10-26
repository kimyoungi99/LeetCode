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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ptr = new ListNode(), mergedList = ptr;
        boolean flag = false;
        
        while(l1 != null && l2 !=null) {
            if(l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            }
            else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
            ptr.next = null;
        }
        if(l1 == null)
            ptr.next = l2;
        else
            ptr.next = l1;
        return mergedList.next;
    }
}