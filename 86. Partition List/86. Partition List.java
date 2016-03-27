/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) 
    {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode lessP = less;
        ListNode greaterP = greater;
        
        while (head != null)
        {
            if (head.val < x)
            {
                lessP.next = head;
                ListNode tmp = head.next;
                head.next = null;
                lessP = lessP.next;
                head = tmp;
            }
            else
            {
                greaterP.next = head;
                ListNode tmp = head.next;
                head.next = null;
                greaterP = greaterP.next;
                head = tmp;
            }
        }
        
        lessP.next = greater.next;
        return less.next;
        
    }
}