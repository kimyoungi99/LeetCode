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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode answer = new ListNode(), ptr = answer;
        int index = argMinList(lists);
        while(index != - 1) {
            ptr.next = lists[index];
            ptr = ptr.next;
            lists[index] = lists[index].next;
            ptr.next = null;
            index = argMinList(lists);
        }
        return answer.next;
    }
    
    public int argMinList(ListNode[] lists) {
        int min = 987654321, answer = -1;
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null && lists[i].val < min) {
                min = lists[i].val;
                answer = i;
            }
        }
        return answer;
    }
}