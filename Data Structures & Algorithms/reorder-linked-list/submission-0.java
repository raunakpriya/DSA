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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode start = slow.next;
        ListNode prev = slow.next = null;

        while(start != null) {
            ListNode temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }

        ListNode merge = head;
        start = prev;
        while(start != null) {
            ListNode temp1 = merge.next;
            ListNode temp2 = start.next;
            merge.next = start;
            start.next = temp1;
            merge = temp1;
            start = temp2;
        }
    }
}
