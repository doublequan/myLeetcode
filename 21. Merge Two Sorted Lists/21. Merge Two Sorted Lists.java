/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode head = l1.val < l2.val ? l1 : l2;
        
        ListNode tail;
        if (l1.val < l2.val)
        {
            tail = l1;
            l1 = l1.next;
        }
        else
        {
            tail = l2;
            l2 = l2.next;
        }
        
        while (l1 != null && l2 != null)
        {
            if (l1.val < l2.val)
            {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
            else
            {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        
        if (l1 == null && l2 !=null) tail.next = l2;
        if (l1 !=null && l2 == null) tail.next = l1;
        
        return head;
    }
}