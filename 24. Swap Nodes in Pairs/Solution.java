/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) 
    {
        if (head == null || head.next == null) return head;
        
        ListNode newHead = head.next;
        
        ListNode n = head;
        while (n != null && n.next != null)
        {
            n = swap(n);
        }
        
        return newHead;
    }
    
    private ListNode swap(ListNode n)
    {
        ListNode res = n.next.next;
        
        ListNode tmp = n.next;
        if (n.next.next != null && n.next.next.next != null)
            n.next = n.next.next.next;
        else
            n.next = n.next.next;
        tmp.next = n;
        
        return res;
    }
}