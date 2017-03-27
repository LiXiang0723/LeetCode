package implementations;

import common.ListNode;

public class DeleteNode {
    public void deleteNode(ListNode node) {
	if (node.next != null) {
	    node.val = node.next.val;
	    node.next = node.next.next;
	} else {
	    node = null;
	}
    }
}
