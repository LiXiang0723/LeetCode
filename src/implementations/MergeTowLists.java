/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import common.ListNode;

/**
 *
 * @author l7xiang
 */
public class MergeTowLists {

    //Time: O(N+M)
    //Space: constant
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2 ==null){
            return null;
        }
        
        if(l1 == null){
            return l2;
        }
        
        if(l2==null){
            return l1;
        }
        
        ListNode head = null;
        ListNode cursor1 = l1;
        ListNode cursor2 = l2;
        ListNode lastNode = null;
        
        while(cursor1!=null && cursor2!=null){
            ListNode next1=cursor1.next;
            ListNode next2=cursor2.next;
            
            if(cursor1.val<cursor2.val){
                if(lastNode !=null){
                    lastNode.next = cursor1;
                }else{
                    head = cursor1;
                }
                lastNode=cursor1;
                cursor1=next1;
            }else{
                if(lastNode !=null){
                    lastNode.next = cursor2;
                }else{ 
                    head = cursor2;
                }
                lastNode = cursor2;
                cursor2=next2;
            }
        }
        
        if(cursor1 == null){
            while(cursor2!=null){
                lastNode.next = cursor2;
                lastNode = lastNode.next;
                cursor2 = cursor2.next;
            }
        }
        
        if(cursor2 ==null){
            while(cursor1 !=null){
                lastNode.next=cursor1;
                lastNode = lastNode.next;
                cursor1 = cursor1.next;
            }
        }
       
       return head;
        
    }

}
