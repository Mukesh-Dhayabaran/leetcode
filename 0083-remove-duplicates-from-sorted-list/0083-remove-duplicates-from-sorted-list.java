class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;

    if(head == null) return head;
    while(curr.next != null)
    {
        if(curr.val == curr.next.val)curr.next = curr.next.next;
        else  curr = curr.next;
    }
    
    return head;
  }
}