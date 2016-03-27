/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) 
    {
        if (head == null) return;
           
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode before = null;
        while (fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            
            ListNode tmp = slow.next;
            slow.next = before;
            before = slow;
            slow = tmp;
        }
        
        
        ListNode insert = null;
        if (fast.next == null)
        {
            insert = slow.next;
            slow.next = null;
        }
        else
        {
            insert = slow.next.next;
            slow.next.next = null;
        }

        while (insert != null)
        {
            ListNode nextinsert = insert.next;
            ListNode nextbefore = before.next;
            before.next = insert;
            insert.next = slow;
            
            slow = before;
            before = nextbefore;
            insert = nextinsert;
        }
        
        return;
    }
}