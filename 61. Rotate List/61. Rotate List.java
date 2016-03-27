/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        for (int i = 0; i < k; i++)
        {
            if (fast.next == null)
            {
                fast = head;
                int steps = k % (i + 1);
                for (int j = 0; j < steps; j++)
                {
                    fast = fast.next;
                }
                break;
            }
            else
            {
                fast = fast.next;
            }
        }
        
        while (fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
        
    }
}