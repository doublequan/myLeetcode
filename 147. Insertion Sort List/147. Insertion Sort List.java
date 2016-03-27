/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) 
    {
        if (head == null) return head;
        
        ListNode n = head.next;
        head.next = null;
        while (n != null)
        {
            ListNode tmp = n.next;
            head = insert(head, n);
            n = tmp;
        }
        return head;
    }
    
    private ListNode insert(ListNode head, ListNode n)
    {
        if (head.val > n.val) 
        {
            n.next = head;
            return n;
        }
        
        ListNode node = head;
        while (node.next != null)
        {
            if (node.next.val > n.val)
            {
                n.next = node.next;
                node.next = n;
                return head;
            }
            node = node.next;
        }
        node.next = n;
        n.next = null;
        return head;
    }
}