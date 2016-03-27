/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        
        Map<RandomListNode, ArrayList<RandomListNode>> waiting = new HashMap();
        
        RandomListNode cur = head;
        RandomListNode copyhead = new RandomListNode(head.label);
        RandomListNode copypre = copyhead;
        if (head.random != null) {
            if (waiting.containsKey(head.random)) {
                waiting.get(head.random).add(copyhead);
            } else {
                ArrayList list = new ArrayList();
                list.add(copyhead);
                waiting.put(head.random, list);
            }
        }
        cur = cur.next;
        while (cur != null) {
            copypre.next = new RandomListNode(cur.label);
            if (cur.random != null) {
                if (waiting.containsKey(cur.random)) {
                    waiting.get(cur.random).add(copypre.next);
                } else {
                    ArrayList list = new ArrayList();
                    list.add(copypre.next);
                    waiting.put(cur.random, list);
                }           
            }
            cur = cur.next;
            copypre = copypre.next;
        }
        
        cur = head;
        RandomListNode copycur = copyhead;
        while (cur != null) {
            if (waiting.containsKey(cur)) {
                for (RandomListNode n : waiting.get(cur)) {
                    n.random = copycur;
                }
            }
            
            cur = cur.next;
            copycur = copycur.next;
        }
                
        return copyhead;
        
    }
}