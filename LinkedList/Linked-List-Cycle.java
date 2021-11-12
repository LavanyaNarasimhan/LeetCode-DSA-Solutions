/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode cur= head; 
        Set<ListNode> nodeSet= new HashSet<>();
        while(cur!=null)
        {
            if(nodeSet.contains(cur))
                return true;
            nodeSet.add(cur);
            cur=cur.next;
            
        }
        return false;
    }
}