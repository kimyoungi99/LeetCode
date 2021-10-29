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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode answer = new ListNode(0, head);
        ListNode ptr = answer;
        
        if(k == 1 || head == null)
            return head;
        
        int index = 0;
        while(ptr.next != null) {
            if(index % k == 0) {
                reverseNextKNode(ptr, k);
            }
            ptr = ptr.next;
            index++;
        }
        
        return answer.next;
    }
    
    public void reverseNextKNode(ListNode ptr, int k) {
        ListNode a = ptr, b = ptr, c = ptr;
        for(int i = 0; i < k; i++) {
            if(c.next == null)
                return;
            c = c.next;
        }
        b = b.next;
        a.next = c;
        a = b;
        b = b.next;
        a.next = c.next;
        c = b.next;
        
        for(int i = 0; i < k - 1; i++) {
            b.next = a;
            a = b;
            b = c;
            if(c == null)
                return;
            c = c.next;
        }
        return;
    }
}