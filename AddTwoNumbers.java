public class AddTwoNumbers {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
                ListNode result = dummyHead;
                int sum = 0, carry = 0;
    
                while (l1 != null || l2 != null) {
                    sum = 0;
    
                    if (l1 != null) {
                        sum += l1.val;
                        l1 = l1.next;
                    }
    
                    if (l2 != null) {
                        sum += l2.val;
                        l2 = l2.next;
                    }
    
                    if (carry != 0) {
                        sum += carry;
                    }
    
                    if (sum / 10 != 0) {
                        ListNode newNode = new ListNode(sum % 10);
                        result.next = newNode;
                        carry = sum / 10;
                        result = newNode;
                    } else {
                        ListNode newNode = new ListNode(sum);
                        result.next = newNode;
                        carry = 0;
                        result = newNode;
                    }
                }
    
                if (carry != 0) {
                    ListNode newNode = new ListNode(carry);
                    result.next = newNode;
                    result = newNode;
                }
    
                return dummyHead.next;
        }
    }
}
