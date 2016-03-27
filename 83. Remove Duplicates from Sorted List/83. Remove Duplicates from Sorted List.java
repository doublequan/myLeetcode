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
        if (head == null) return null;
        
        ListNode n = head;
        while (n.next != null)
        {
            if (n.val == n.next.val)
            {
                n.next = n.next.next;
            }
            else
            {
                n = n.next;
            }
        }
        return head;
    }
}