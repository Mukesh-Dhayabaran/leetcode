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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null || nums.length==0) return head;
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
        {
            set.add(n);
        }

        while(head != null && set.contains(head.val))
        {
            head = head.next;
        }
        ListNode ptr = head;
        while(ptr != null && ptr.next != null)
        {
            if(set.contains(ptr.next.val))
            {
                ptr.next = ptr.next.next;
            }

            else
            {
                ptr = ptr.next;
            }
        }

        return head;
    }
}