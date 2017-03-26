package implementations;

import common.ListNode;

public class ReverseLinkedList {
    // Time:O(N)
    public ListNode reverseList(ListNode head) {
	if (head == null) {
	    return head;
	}

	ListNode newHead = null;
	ListNode next = head.next;
	while (head != null) {
	    head.next = newHead;
	    newHead = head;
	    if (next != null) {
		head = next;
		next = next.next;
	    } else {
		break;
	    }
	}

	return head;

    }
}
