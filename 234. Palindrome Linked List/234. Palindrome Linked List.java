/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        if (head == null || head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverse(slow.next);
        
        ListNode first = head;
        ListNode second = slow.next;
        while (second != null)
        {
            if (first.val != second.val)
            {
                slow.next = reverse(slow.next);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        
        slow.next = reverse(slow.next);
        
        return true;
        
    }
    
    
    private ListNode reverse(ListNode head)
    {
        ListNode before = null;
        while (head != null)
        {
            ListNode tmp = head.next;
            head.next = before;
            before = head;
            head = tmp;
        }
        return before;
    }

}
