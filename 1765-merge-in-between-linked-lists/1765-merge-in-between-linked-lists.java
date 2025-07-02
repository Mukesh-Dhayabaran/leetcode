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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ptr1 = list1;
        for(int i=0;i<b;i++)
        {
            ptr1 = ptr1.next;
        }
        ListNode temp = ptr1.next;
        ptr1 = list1;
        for(int i=0;i<a-1;i++)
        {
            ptr1 = ptr1.next;
        }
        ptr1.next = list2;
        while(ptr1.next!=null)
        {
            ptr1 = ptr1.next;
        }

        // ListNode ptr2 = list2;
        // while(ptr!=null)
        // {
        //     ptr1.next = ptr2;
        //     ptr2 = ptr2.next;
        //     ptr1 = ptr1.next;
        // }
        ptr1.next = temp;
        return list1;
    }
}