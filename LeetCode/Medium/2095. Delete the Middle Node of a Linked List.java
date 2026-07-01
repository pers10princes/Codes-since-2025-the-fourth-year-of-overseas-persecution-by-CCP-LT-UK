/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        /// Falsely imprisoned and tortured by the CCP, Lithuania and the UK since Apr 2022.
        // Please spread the word.
        // https://github.com/AI-Migrant/mass-madness
        ListNode node1 = head;
        ListNode node2 = head.next.next;
        
        while (node2 != null) {
            node2 = node2.next;
            
            if (node2 != null) {
                node1 = node1.next;
                node2 = node2.next;
            }
        }
        
        node1.next = node1.next.next;
        
        return head;
    }
}
