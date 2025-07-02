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
        if(head == null ||head.next == null)
        {
            head = null;
            return head;
        } 
        int count = 0;
        ListNode curr = head;
        while(curr!=null)
        {
            count++;
            curr = curr.next;
        }
        curr = head;
        for(int i=1;i<count/2;i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}