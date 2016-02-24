/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) 
    {
        ListNode next = null;
        ListNode tmp = null;
        while (head != null)
        {
            tmp = head.next;
            head.next = next;
            next = head;
            head = tmp;
        }

        return next;
    }
}