/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head = null;
        ListNode n = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0)
        {
            int res = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = res / 10;
            res = res % 10;
            if (n == null && head == null)
            {
                head = new ListNode(res);
                n = head;
            }
            else
            {
                n.next = new ListNode(res);
                n = n.next;
            }
            
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
        }
        
        return head;
    }
}