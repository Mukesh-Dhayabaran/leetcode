class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode start = new ListNode();
    ListNode ptr = start;
   
    while(list1!=null && list2!=null)
    {
        if(list1.val<=list2.val)
        {
            ptr.next = list1;
            list1 = list1.next;
        } 
        else 
        {
            ptr.next = list2;
            list2 = list2.next;
        }
        ptr = ptr.next;
    }
        if(list1!=null) ptr.next = list1;
        if(list2!=null) ptr.next = list2;
        
    
    return start.next;
  }
}