package implementations;

import common.ListNode;

public class RemoveElements {
    //Time:O(N)
    public ListNode removeElements(ListNode head, int val) {
        if(head ==null){
            return null;
        }
        
        while(head!=null&&head.val==val){
            head=head.next;
        }
        
        ListNode cursor = head;
        while(cursor!=null){
            if(cursor.next!=null){
               if(cursor.next.val == val){
                   cursor.next=cursor.next.next;
                   continue;
               }
            }
           cursor=cursor.next;
        }
        
        return head;
    }
}
