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
    public ListNode swapPairs(ListNode head) {
        ListNode answer = new ListNode(0, head);
        ListNode ptr = answer;
        while(swapPair(ptr)) {
            ptr = ptr.next.next;
        }
        return answer.next;
    }
    
    public boolean swapPair(ListNode ptr) {
        if(ptr.next == null || ptr.next.next == null)
            return false;
        ListNode tmp = ptr.next;
        ptr.next = ptr.next.next;
        tmp.next = ptr.next.next;
        ptr.next.next = tmp;
        return true;
    }
}