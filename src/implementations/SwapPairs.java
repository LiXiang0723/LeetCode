package implementations;

import common.ListNode;

public class SwapPairs {
    // Time:O(N)
    // Space:Constant
    public ListNode swapPairs(ListNode head) {
	if (head == null) {
	    return null;
	}

	if (head.next == null) {
	    return head;
	}

	// 2 cursors next to each other.
	ListNode n1 = head;
	ListNode n2 = head.next;
	// Directly set the head to the 2nd node
	head = n2;
	// Cursor to store the 2nd node in the swapped pair.
	ListNode lastNode = null;

	while (n1 != null && n2 != null) {
	    // Store the next locations for both cursors
	    ListNode n1Next = n2.next;
	    ListNode n2Next = (n1Next == null ? null : n1Next.next);

	    // Swap nodes
	    n1.next = n1Next;
	    n2.next = n1;

	    // Attach to the swapped list
	    if (lastNode != null) {
		lastNode.next = n2;
	    }
	    lastNode = n1;
	    n1 = n1Next;
	    n2 = n2Next;
	}

	return head;
    }
}
