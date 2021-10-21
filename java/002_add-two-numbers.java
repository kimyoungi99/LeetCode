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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0, null);
        ListNode ptr = answer;
        int digit = 1, adder = 0;
        
        ptr.val = l1.val + l2.val;
        if(ptr.val >= 10) {
            ptr.val %= 10;
            adder = 1;
        }
        
        while(l1.next != null || l2.next != null || adder != 0) {
            ListNode node = new ListNode(0, null);
            ptr.next = node;
            ptr = ptr.next;
            if(l1.next != null) {
                l1 = l1.next;
                ptr.val += l1.val;
            }
            if(l2.next != null) {
                l2 = l2.next;
                ptr.val += l2.val;
            }
            ptr.val += adder;
            adder = 0;
            if(ptr.val >= 10) {
                ptr.val %= 10;
                adder = 1;
            }
        }
        
        return answer;
    }
}