/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) 
    {
        if (head == null || head.next == null)
            return head;
            
        ListNode firstEven = head.next;
        int count = 2;
        ListNode tmp = head;
        ListNode tmpNext = null;
        while (tmp.next.next != null)
        {
            tmpNext = tmp.next;
            tmp.next = tmp.next.next;
            count++;
            tmp = tmpNext;
        }
        if ((count%2) == 1)
        {
            tmp.next.next = firstEven;
            tmp.next = null;
        }
        else
        {
            tmp.next = firstEven;
        }
        
        return head;
        
    }
    
}