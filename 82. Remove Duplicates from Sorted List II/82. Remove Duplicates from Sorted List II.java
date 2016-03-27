/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
        while (head != null && head.next != null && head.val == head.next.val)
        {
            head = findFirstDiff(head);
        }
        
        ListNode n = head;
        while (n != null && n.next != null && n.next.next != null)
        {
            if (n.next.val == n.next.next.val)
            {
                n.next = findFirstDiff(n.next);
            }
            else
            {
                n = n.next;
            }
        }
        
        return head;
        
        
    }
    
    
    // return the first node which has a different val with head 
    private ListNode findFirstDiff(ListNode head)
    {
        if (head == null) return head;
        while (head.next != null)
        {
            if (head.val == head.next.val)
            {
                head = head.next;
            }
            else
            {
                return head.next;
            }
        }
        return head.next;
        
    }
}