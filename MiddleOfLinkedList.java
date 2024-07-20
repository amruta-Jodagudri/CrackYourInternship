public class MiddleOfLinkedList {
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
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
                return head;
            }
            ListNode q1 = head;
            int count = 0;
            while (q1 != null) {
                count++;
                q1 = q1.next;
            }
            int x = count / 2;
            ListNode temp = head;
            int a = 0;
            while (a != x - 1) {
                temp = temp.next;
                a++;
            }
            return temp.next;
    }
}
}
