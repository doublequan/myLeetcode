/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        
        Stack s = new Stack();
        ListNode n = head;
        while (n.next != null)
        {
            s.push(n);
            n = n.next;
        }
        //n is the tail now, s contains all the node expect the tail in reverse order
        
        ListNode tail = n;
        while (!s.isEmpty())
        {
            n.next = (ListNode)s.pop();
            n = n.next;
        }
        //n is the original head now
        n.next = null;
        return tail;
    }
}