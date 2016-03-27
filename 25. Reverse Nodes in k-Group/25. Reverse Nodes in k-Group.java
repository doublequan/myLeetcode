/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 1) return head;
        if (isLast(head, k)) return head;
        
        ListNode newhead = reverse(head, k);
        ListNode newtail = head;
        
        ListNode node = head.next;
        while (!isLast(node, k))
        {
            newtail.next = reverse(node, k);
            newtail = node;
            node = node.next;
        }
        
        return newhead;

    }
    
    
    private boolean isLast(ListNode n, int k)
    {
        int count = 0;
        while (n != null)
        {
            count++;
            if (count >= k) return false;
            n = n.next;
        }
        return true;
    }
    
    //reverse the list, return the new head, the input head.next will be modified to the k+1 node
    private ListNode reverse(ListNode head, int k)
    {
        ListNode newhead = head;
        ListNode before = null;
        for (int i = 0; i < k; i++)
        {
            ListNode tmp = newhead.next;
            newhead.next = before;
            before = newhead;
            newhead = tmp;
        }
        head.next = newhead;
        return before;
    }
    
}