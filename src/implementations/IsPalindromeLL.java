package implementations;

import common.ListNode;

public class IsPalindromeLL {
    // Time O(N)
    // Space O(1)
    public boolean isPalindrome(ListNode head) {
	if (head == null) {
	    return true;
	}

	if (head.next == null) {
	    return true;
	}

	ListNode fast = head;
	ListNode slow = head;

	// Move fast cursor to the tail and slow to the middle
	while (fast.next != null) {
	    if (fast.next.next == null) {
		fast = fast.next;
	    } else {
		fast = fast.next.next;
	    }

	    slow = slow.next;
	}

	// Reverse the second half
	ListNode tmp = null;
	ListNode next = slow.next;
	while (slow != null) {
	    slow.next = tmp;
	    tmp = slow;
	    slow = next;
	    if (next != null) {
		next = next.next;
	    }
	}

	// Traverse from both ends to check each node
	while (head != fast && head != null && fast != null) {
	    if (head.val != fast.val) {
		return false;
	    }

	    head = head.next;
	    fast = fast.next;
	}

	return true;

    }
}
