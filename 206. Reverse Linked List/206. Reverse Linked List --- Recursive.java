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
        return reverse(null, head);
    }
    
    private ListNode reverse(ListNode first, ListNode next)
    {
        if (next == null) return first;
        
        ListNode n = next.next;
        next.next = first;
        return reverse(next, n);
    }
}