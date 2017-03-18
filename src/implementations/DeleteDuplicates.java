package implementations;

import common.ListNode;

public class DeleteDuplicates {
    //Time: O(N)
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode i = head;
        ListNode j = head.next;
        
        while(j!=null&&i!=null){
            if(j.val==i.val){
                j = j.next;
            }else{
                i=i.next;
                i.val=j.val;
            }
        }
        i.next = null;
        return head;
    }
}
