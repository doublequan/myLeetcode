/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) 
    {
        ListNode oldHead = head;
        
        int count = 1;
        ListNode before = null;
        ListNode after = null;
        ListNode newHead = null;
        ListNode newTail = null;
        ListNode newNext = null;
        while (head != null)
        {
            if (count == m - 1) before = head;
            if (count == m)     newTail = head;
            if (count == n)     newHead = head;
            if (count == n + 1) after = head;
            
            if (count > m && count <= n)
            {
                ListNode tmp = head.next;
                head.next = newNext;
                newNext = head; 
                head = tmp;
            }
            else
            {
                newNext = head;
                head = head.next;
            }
            count++;
        }
        
        if (before != null)
            before.next = newHead;
        newTail.next = after;
        
        return m == 1 ? newHead : oldHead;
    }
    
}