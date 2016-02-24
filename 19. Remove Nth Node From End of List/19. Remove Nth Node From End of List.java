/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if (head == null) return head;
        
        ListNode beforeTarget = head;
        ListNode fast = head;
        for (int i = 1; i < n + 1; i++)
        {
            fast = fast.next;
        }
        
        //del the first node
        if (fast == null)
            return head.next;
        
        while (fast.next != null)
        {
            fast = fast.next;
            beforeTarget = beforeTarget.next;
        }
        
        if (beforeTarget.next != null)
            beforeTarget.next = beforeTarget.next.next;
        else
            beforeTarget = null;
            
        return head;
    }
}