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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int listLength = lengthOfList(head);
        if(listLength - n == 0)
            return head.next;
        for(int i = 0; i < listLength - n - 1; i++)
            ptr = ptr.next;
        if(n == 1)
            ptr.next = null;
        else
            ptr.next = ptr.next.next;
        
        return head;
    }
    
    public int lengthOfList(ListNode head) {
        int length = 0;
        if(head != null)
            length++;
        while(head.next != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}