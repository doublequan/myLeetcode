/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        
        int LenA = length(A);
        int LenB = length(B);
        
        if (LenA > LenB)
        {
            while (LenA != LenB)
            {
                A = A.next;
                LenA--;
            }
        }
        else
        {
            while (LenA != LenB)
            {
                B = B.next;
                LenB--;
            }
        }
        
        assert LenA == LenB: "==";
        
        for (int i = 0; i < LenA; i++)
        {
            if (A == B) return A;
            A = A.next;
            B = B.next;
        }
        return null;
        
        
    }
    
    private int length(ListNode n)
    {
        int len = 0;
        while (n != null)
        {
            len++;
            n = n.next;
        }
        return len;
    }
}